package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DossierAdmissionImpl implements DossierAdmission {
    private List<DocumentAdmission> documentsAdmission = new ArrayList<>();
    private Etudiant candidat;

    DossierAdmissionImpl() {}

    DossierAdmissionImpl(Etudiant candidat) {
        this.candidat = candidat;
    }

    DossierAdmissionImpl(Etudiant candidat, List<DocumentAdmission> listeDocumentAdmission) {
        this.candidat = candidat;
        this.documentsAdmission = listeDocumentAdmission;
    }

    @Override
    public Etudiant getCandidat() {
        return this.candidat;
    }

    @Override
    public void setCandidat(Etudiant candidat) {
        if (candidat != null) {
            this.candidat = candidat;
        }
    }

    @Override
    public void ajouterDocumentAdmission(DocumentAdmission document) {
        if (document != null) {
            this.documentsAdmission.add(document);
        }
    }

    @Override
    public DocumentAdmission retirerDocumentAdmission(DocumentAdmission document) {
        if (this.documentsAdmission.remove(document)) {
            return document;
        } else {
            return null;
        }
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmission() {
        return new ArrayList<>(this.documentsAdmission);
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmissionAvecStatut(StatutVerificationDocument statut) {
        List<DocumentAdmission> listeDocumentAdmissionAvecStatut = new ArrayList<>();
        for (DocumentAdmission documentAdmission : this.documentsAdmission) {
            if (documentAdmission.getStatutVerificationDocument() == statut) {
                listeDocumentAdmissionAvecStatut.add(documentAdmission);
            }
        }
        return listeDocumentAdmissionAvecStatut;
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmissionDeType(TypeDocumentAdmission typeDocument) {
        List<DocumentAdmission> listeTypeDocument = new ArrayList<>();
        for (DocumentAdmission documentAdmission : this.documentsAdmission) {
            if (documentAdmission.getTypeDocumentAdmission() == typeDocument) {
                listeTypeDocument.add(documentAdmission);
            }
        }
        return listeTypeDocument;
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmissionAvecTypeEtStatut(TypeDocumentAdmission typeDocument, StatutVerificationDocument statut) {
        List<DocumentAdmission> listeDocumentAdmission = new ArrayList<>();
        for (DocumentAdmission documentAdmission : this.documentsAdmission) {
            if (documentAdmission.getTypeDocumentAdmission() == typeDocument && documentAdmission.getStatutVerificationDocument() == statut) {
                listeDocumentAdmission.add(documentAdmission);
            }
        }
        return listeDocumentAdmission;
    }
}
