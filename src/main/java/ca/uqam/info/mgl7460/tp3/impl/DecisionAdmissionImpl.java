package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.ConditionAdmission;
import ca.uqam.info.mgl7460.tp3.types.DecisionAdmission;
import ca.uqam.info.mgl7460.tp3.types.LibelleDecision;
import ca.uqam.info.mgl7460.tp3.types.MotifRefus;

import java.util.Date;

public class DecisionAdmissionImpl implements DecisionAdmission {
    Date dateDecision = new Date();
    LibelleDecision libelleDecision;
    ConditionAdmission conditionAdmission;
    MotifRefus motifRefus;
    String commentaireDecision;
    Boolean decisionConforme;

    DecisionAdmissionImpl() {}

    DecisionAdmissionImpl(LibelleDecision libelleDecision, ConditionAdmission conditionAdmission,
                            String commentaireDecision, boolean decisionConforme) {
        this.libelleDecision = libelleDecision;
        this.conditionAdmission = conditionAdmission;
        this.commentaireDecision = commentaireDecision;
        this.decisionConforme = decisionConforme;
    }

    DecisionAdmissionImpl(LibelleDecision libelleDecision, ConditionAdmission conditionAdmission,
                          String commentaireDecision, boolean decisionConforme, MotifRefus motifRefus) {
        this(libelleDecision, conditionAdmission, commentaireDecision, decisionConforme);
        this.motifRefus = motifRefus;
    }

    @Override
    public Date getDateDecision() {
        return this.dateDecision;
    }

    @Override
    public LibelleDecision getDecision() {
        return this.libelleDecision;
    }

    @Override
    public void setDecision(LibelleDecision libelleDecision) {
        this.libelleDecision = libelleDecision;
    }

    @Override
    public ConditionAdmission getConditionAdmission() {
        return this.conditionAdmission;
    }

    @Override
    public void setConditionAdmission(ConditionAdmission condition) {
        this.conditionAdmission = condition;
    }

    @Override
    public MotifRefus getMotifRefus() {
        return this.motifRefus;
    }

    @Override
    public void setMotifRefus(MotifRefus motif) {
        this.motifRefus = motif;
    }

    @Override
    public String getCommentairesDecision() {
        return this.commentaireDecision;
    }

    @Override
    public void setCommentairesDecision(String commentaire) {
        this.commentaireDecision = commentaire;
    }

    @Override
    public boolean isDecisionConforme() {
        return this.decisionConforme;
    }

    @Override
    public void setDecisionConforme(boolean vraiIOuFaux) {
        this.decisionConforme = vraiIOuFaux;
    }
}
