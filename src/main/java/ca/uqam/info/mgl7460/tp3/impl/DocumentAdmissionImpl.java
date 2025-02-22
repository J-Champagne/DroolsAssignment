package ca.uqam.info.mgl7460.tp3.impl;

import ca.uqam.info.mgl7460.tp3.types.DocumentAdmission;
import ca.uqam.info.mgl7460.tp3.types.StatutVerificationDocument;
import ca.uqam.info.mgl7460.tp3.types.TypeDocumentAdmission;

import java.util.Date;

public class DocumentAdmissionImpl implements DocumentAdmission {
    TypeDocumentAdmission typeDocumentAdmission;
    StatutVerificationDocument statutVerificationDocument;
    Date dateReception = new Date();
    Date dateStatusVerificationDocument = new Date();

    DocumentAdmissionImpl() {}

    DocumentAdmissionImpl(TypeDocumentAdmission typeDocumentAdmission, StatutVerificationDocument
                statutVerificationDocument) {
        this.typeDocumentAdmission = typeDocumentAdmission;
        this.statutVerificationDocument = statutVerificationDocument;
    }

    @Override
    public TypeDocumentAdmission getTypeDocumentAdmission() {
        return this.typeDocumentAdmission;
    }

    @Override
    public void setTypeDocumentAdmission(TypeDocumentAdmission typeDocument) {
        this.typeDocumentAdmission = typeDocument;
    }

    @Override
    public Date getDateReception() {
        return this.dateReception;
    }

    @Override
    public void setDateReception(Date date) {
        this.dateReception = date;
    }

    @Override
    public StatutVerificationDocument getStatutVerificationDocument() {
        return this.statutVerificationDocument;
    }

    @Override
    public void setStatutVerificationDocument(StatutVerificationDocument statut) {
        this.statutVerificationDocument = statut;
    }

    @Override
    public Date getDateStatutVerificationDocument() {
        return this.dateStatusVerificationDocument;
    }
}
