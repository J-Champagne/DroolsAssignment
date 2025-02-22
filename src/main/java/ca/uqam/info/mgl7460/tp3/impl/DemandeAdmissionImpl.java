package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.*;
import java.util.Date;

public class DemandeAdmissionImpl implements DecisionAdmission {
    private Etudiant candidat;
    private Programme programme;
    private SessionAdmission sessionAdmission;
    private Date dateDemandeAdmission = new Date();
    private BaseAdmission baseAdmission;
    private DossierAdmission dossierAdmission;
    private DecisionAdmission decisionAdmission;
    private int coteR;
    private float moyennePourBaseAdmission;

    DemandeAdmissionImpl() {}

    DemandeAdmissionImpl(Etudiant candidat, Programme programme, SessionAdmission sessionAdmission,
                         BaseAdmission baseAdmission, DossierAdmission dossierAdmission, int coteR,
                         float moyennePourBaseAdmission) {
        this.candidat = candidat;
        this.programme = programme;
        this.sessionAdmission = sessionAdmission;
        this.baseAdmission = baseAdmission;
        this.dossierAdmission = dossierAdmission;
        this.coteR = coteR;
        this.moyennePourBaseAdmission = moyennePourBaseAdmission;
    }

    @Override
    public Date getDateDecision() {
        return this.dateDemandeAdmission;
    }

    @Override
    public LibelleDecision getDecision() {
        return this.decisionAdmission.getDecision();
    }

    @Override
    public ConditionAdmission getConditionAdmission() {
        return this.decisionAdmission.getConditionAdmission();
    }

    @Override
    public void setConditionAdmission(ConditionAdmission condition) {
        this.decisionAdmission.setConditionAdmission(condition);
    }

    @Override
    public MotifRefus getMotifRefus() {
        return this.decisionAdmission.getMotifRefus();
    }

    @Override
    public void setMotifRefus(MotifRefus motif) {
        this.decisionAdmission.setMotifRefus(motif);
    }

    @Override
    public String getCommentairesDecision() {
        return this.decisionAdmission.getCommentairesDecision();
    }

    @Override
    public void setCommentairesDecision(String commentaire) {
        this.decisionAdmission.setCommentairesDecision(commentaire);
    }

    @Override
    public boolean isDecisionConforme() {
        return this.decisionAdmission.isDecisionConforme();
    }

    @Override
    public void setDecisionConforme(boolean vraiIOuFaux) {
        this.decisionAdmission.setDecisionConforme(vraiIOuFaux);
    }
}
