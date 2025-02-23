package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.*;

public class FabriqueGestionAdmissionsImpl implements FabriqueGestionAdmissions {
    private static FabriqueGestionAdmissions instance;

    private FabriqueGestionAdmissionsImpl() {}

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
        return new DossierAdmissionImpl(candidat);
    }

    @Override
    public DocumentAdmission creerDocumentAdmission(TypeDocumentAdmission typeD) {
        return new DocumentAdmissionImpl(typeD);
    }

    @Override
    public CritereAdmission creerCritereAdmission() {
        return new CritereAdmissionImpl();
    }

    @Override
    public DecisionAdmission creerDecisionAdmission(LibelleDecision libelle) {
        return new DecisionAdmissionImpl(libelle);
    }

    @Override
    public static FabriqueGestionAdmissions getSingleton() {
        return getInstance();
    }

    public static FabriqueGestionAdmissions getInstance() {
        if (instance == null) {
            instance = new FabriqueGestionAdmissionsImpl();
        }
        return instance;
    }
}
