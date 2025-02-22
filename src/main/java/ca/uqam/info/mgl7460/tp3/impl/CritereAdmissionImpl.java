package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.BaseAdmission;
import ca.uqam.info.mgl7460.tp3.types.CritereAdmission;
import ca.uqam.info.mgl7460.tp3.types.LibelleDomaine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CritereAdmissionImpl implements CritereAdmission {
    BaseAdmission baseAdmission;
    float moyenneMinimale;
    List<LibelleDomaine> libelleDomaines = new ArrayList<LibelleDomaine>();

    CritereAdmissionImpl() {}

    CritereAdmissionImpl(BaseAdmission baseAdmission, float moyenneMinimale) {
        this.baseAdmission = baseAdmission;
        this.moyenneMinimale = moyenneMinimale;
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
    public float getMoyenneMinimale() {
        return this.moyenneMinimale;
    }

    @Override
    public void setMoyenneMinimale(float moyenne) {
        this.moyenneMinimale = moyenne;
    }

    @Override
    public Collection<LibelleDomaine> getDomainesAdmissibles() {
        return new ArrayList<>(libelleDomaines);
    }

    @Override
    public void ajouterDomaineAdmission(LibelleDomaine libelle) {
        if (libelle != null) {
            libelleDomaines.add(libelle);
        }
    }

    @Override
    public void retirerDomaineAdmission(LibelleDomaine libelle) {
        this.libelleDomaines.remove(libelle);
    }
}
