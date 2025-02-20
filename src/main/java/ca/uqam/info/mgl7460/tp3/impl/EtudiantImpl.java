package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.Etudiant;

public class EtudiantImpl implements Etudiant {
    String codePermanent;
    String prenom;
    String nom;

    public EtudiantImpl() {}

    public EtudiantImpl(String codePermanent, String prenom, String nom) {}

    @Override
    public String getCodePermanent() {
        return codePermanent;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
