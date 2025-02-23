package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.*;

public class FabriqueGestionAdmissionsImpl implements FabriqueGestionAdmissions {
    private static FabriqueGestionAdmissions instance;

    @Override
    public Etudiant creerEtudiant(String nom, String prenom, String codePermanent) {
        return new EtudiantImpl(nom, prenom, codePermanent);
    }

    @Override
    public Etudiant getEtudiantAvecCodePermanent(String code) {
        return null;
    }

    @Override
    public Programme creerProgramme(String nom, String numero) {
        return new ProgrammeImpl(nom, numero);
    }

    @Override
    public Programme getProgrammeAvecCode(String code) {
        return null;
    }

    @Override
    public DemandeAdmission creerDemandeAdmission(Etudiant candidat, Programme programme, SessionAdmission session) {
        return new DemandeAdmissionImpl(candidat, programme, session);
    }

    @Override
    public DossierAdmission creerDossierAdmission(Etudiant candidat) {
        return null;
    }

    @Override
    public DocumentAdmission creerDocumentAdmission(TypeDocumentAdmission typeD) {
        return null;
    }

    @Override
    public CritereAdmission creerCritereAdmission() {
        return null;
    }

    @Override
    public DecisionAdmission creerDecisionAdmission(LibelleDecision libelle) {
        return null;
    }

    @Override
    public FabriqueGestionAdmissions getSingleton() {
        if (instance == null) {
            instance = new FabriqueGestionAdmissionsImpl();
        }
        return instance;
    }
}
