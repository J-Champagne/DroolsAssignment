package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.CritereAdmission;
import ca.uqam.info.mgl7460.tp3.types.Programme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProgrammeImpl implements Programme {
    private String nom;
    private String numero;
    private String description;
    private int credit;
    private List<CritereAdmission> criteresAdmission = new ArrayList<CritereAdmission>();

    ProgrammeImpl() {}

    ProgrammeImpl(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    ProgrammeImpl(String nom, String numero, String description, int credit) {
        this(nom, numero);
        this.description = description;
        this.credit = credit;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getNumero() {
        return this.numero;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getNombreCredits() {
        return this.credit;
    }

    @Override
    public void setNombreCredits(int nombre) {
        this.credit = nombre;
    }

    @Override
    public Collection<CritereAdmission> getCriteresAdmission() {
        return new ArrayList<>(this.criteresAdmission);
    }

    @Override
    public void ajouteCritereAdmission(CritereAdmission critere) {
        this.criteresAdmission.add(critere);
    }

    @Override
    public CritereAdmission retireCritereAdmission(CritereAdmission critere) {
        if (this.criteresAdmission.remove(critere)) {
            return critere;
        } else {
            return null;
        }
    }
}
