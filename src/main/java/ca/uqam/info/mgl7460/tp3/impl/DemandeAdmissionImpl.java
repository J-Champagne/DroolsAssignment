package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.*;
import java.util.Date;

public class DemandeAdmissionImpl implements DemandeAdmission {
    private Etudiant candidat;
    private Programme programme;
    private SessionAdmission sessionAdmission;
    private Date dateDemandeAdmission = new Date();
    private BaseAdmission baseAdmission;
    private DossierAdmission dossierAdmission;
    private DecisionAdmission decisionAdmission;
    private int coteR;
    private float moyennePourBaseAdmission;

    public DemandeAdmissionImpl() {}

    public DemandeAdmissionImpl(Etudiant candidat, Programme programme, SessionAdmission sessionAdmission) {
        this.candidat = candidat;
        this.programme = programme;
        this.sessionAdmission = sessionAdmission;
    }

    public DemandeAdmissionImpl(Etudiant candidat, Programme programme, SessionAdmission sessionAdmission,
                         BaseAdmission baseAdmission, DossierAdmission dossierAdmission, int coteR,
                         float moyennePourBaseAdmission) {
        this(candidat, programme, sessionAdmission);
        this.baseAdmission = baseAdmission;
        this.dossierAdmission = dossierAdmission;
        this.coteR = coteR;
        this.moyennePourBaseAdmission = moyennePourBaseAdmission;
    }

    @Override
    public Etudiant getCandidat() {
        return this.candidat;
    }

    @Override
    public Date getDateDemandeAdmission() {
        return this.dateDemandeAdmission;
    }

    @Override
    public Programme getProgramme() {
        return this.programme;
    }

    @Override
    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    @Override
    public SessionAdmission getSessionAdmission() {
        return this.sessionAdmission;
    }

    @Override
    public void setSessionAdmission(SessionAdmission session) {
        this.sessionAdmission = session;
    }

    @Override
    public BaseAdmission getBaseAdmission() {
        return this.baseAdmission;
    }

    @Override
    public void setBaseAdmission(BaseAdmission base) {
        this.baseAdmission = base;
    }

    @Override
    public int getCoteR() {
        return this.coteR;
    }

    @Override
    public void setCoteR(int cote) {
        this.coteR = cote;
    }

    @Override
    public void setMoyennePourBaseAdmission(float moyenne) {
        this.moyennePourBaseAdmission = moyenne;
    }

    @Override
    public float getMoyennePourBaseAdmission() {
        return this.moyennePourBaseAdmission;
    }

    @Override
    public DossierAdmission getDossierAdmission() {
        return this.dossierAdmission;
    }

    @Override
    public void ajouterDocumentAdmission(DocumentAdmission document) {
        this.dossierAdmission.ajouterDocumentAdmission(document);
    }

    @Override
    public DocumentAdmission retirerDocumentAdmission(DocumentAdmission document) {
        return this.dossierAdmission.retirerDocumentAdmission(document);
    }

    @Override
    public DecisionAdmission getDecisionAdmission() {
        return this.decisionAdmission;
    }

    @Override
    public DecisionAdmission setLibelleDecisionAdmission(LibelleDecision libelle) {
        DecisionAdmission decisionAdmission = this.decisionAdmission;
        if (decisionAdmission != null) {
            this.decisionAdmission.setDecision(libelle);
        }
        return decisionAdmission;
    }

    @Override
    public DecisionAdmission setCommentaireDecision(String commentaireDecision) {
        DecisionAdmission decisionAdmission = this.decisionAdmission;
        if (decisionAdmission != null) {
            this.decisionAdmission.setCommentairesDecision(commentaireDecision);
        }
        return decisionAdmission;
    }

    @Override
    public DecisionAdmission setConditionAdmission(ConditionAdmission condition) throws DecisionNonConforme {
        DecisionAdmission decisionAdmission = this.decisionAdmission;
        if (decisionAdmission != null) {
            if (!decisionAdmission.isDecisionConforme()) {
                throw new DecisionNonConforme(decisionAdmission.getDecision(), decisionAdmission.getConditionAdmission(),
                        decisionAdmission.getMotifRefus(), decisionAdmission.getCommentairesDecision());
            } else {
                this.decisionAdmission.setConditionAdmission(condition);
            }
        }
        return decisionAdmission;
    }

    @Override
    public DecisionAdmission setMotifRefus(MotifRefus motif) throws DecisionNonConforme {
        DecisionAdmission decisionAdmission = this.decisionAdmission;
        if (decisionAdmission != null) {
            if (!decisionAdmission.isDecisionConforme()) {
                throw new DecisionNonConforme(decisionAdmission.getDecision(), decisionAdmission.getConditionAdmission(),
                        decisionAdmission.getMotifRefus(), decisionAdmission.getCommentairesDecision());
            } else {
                this.decisionAdmission.setMotifRefus(motif);
            }
        }
        return decisionAdmission;
    }
}
