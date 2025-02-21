package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DossierAdmissionImpl implements DossierAdmission {
    private List<DocumentAdmission> listeDocumentAdmission = new ArrayList<>();
    private Etudiant candidat;
    private Programme programme;
    private SessionAdmission sessionAdmission;
    private BaseAdmission baseAdmission;
    private DossierAdmission dossierAdmission;
    private DecisionAdmission decisionAdmission;
    private int coteR;
    private float moyennePourBaseAdmission;

    DossierAdmissionImpl() {}

    DossierAdmissionImpl(Etudiant candidat, Programme programme, SessionAdmission sessionAdmission,
                            BaseAdmission baseAdmission, DossierAdmission dossierAdmission,
                            DecisionAdmission decisionAdmission, int coteR, float moyennePourBaseAdmission) {
        this.candidat = candidat;
        this.programme = programme;
        this.sessionAdmission = sessionAdmission;
        this.baseAdmission = baseAdmission;
        this.dossierAdmission = dossierAdmission;
        this.decisionAdmission = decisionAdmission;
        this.coteR = coteR;
        this.moyennePourBaseAdmission = moyennePourBaseAdmission;
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
            this.listeDocumentAdmission.add(document);
        }
    }

    @Override
    public DocumentAdmission retirerDocumentAdmission(DocumentAdmission document) {
        if (this.listeDocumentAdmission.remove(document)) {
            return document;
        } else {
            return null;
        }
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmission() {
        return new ArrayList<>(this.listeDocumentAdmission);
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmissionAvecStatut(StatutVerificationDocument statut) {
        List<DocumentAdmission> listeDocumentAdmissionAvecStatut = new ArrayList<>();
        for (DocumentAdmission documentAdmission : this.listeDocumentAdmission) {
            if (documentAdmission.getStatutVerificationDocument() == statut) {
                listeDocumentAdmissionAvecStatut.add(documentAdmission);
            }
        }
        return listeDocumentAdmissionAvecStatut;
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmissionDeType(TypeDocumentAdmission typeDocument) {
        List<DocumentAdmission> listeTypeDocument = new ArrayList<>();
        for (DocumentAdmission documentAdmission : this.listeDocumentAdmission) {
            if (documentAdmission.getTypeDocumentAdmission() == typeDocument) {
                listeTypeDocument.add(documentAdmission);
            }
        }
        return listeTypeDocument;
    }

    @Override
    public Collection<DocumentAdmission> getListeDocumentAdmissionAvecTypeEtStatut(TypeDocumentAdmission typeDocument, StatutVerificationDocument statut) {
        List<DocumentAdmission> listeDocumentAdmission = new ArrayList<>();
        for (DocumentAdmission documentAdmission : this.listeDocumentAdmission) {
            if (documentAdmission.getTypeDocumentAdmission() == typeDocument && documentAdmission.getStatutVerificationDocument() == statut) {
                listeDocumentAdmission.add(documentAdmission);
            }
        }
        return listeDocumentAdmission;
    }
}
