package entity;

import jakarta.persistence.*;

@Entity
@Table(name="kyc_documents")
public class KycDocument {

    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)

    private int documentId;

    private String aadhaarNumber;

    private String panNumber;

    private String status;

    @OneToOne
    private Customer customer;

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(
            int documentId) {
        this.documentId = documentId;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(
            String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(
            String panNumber) {
        this.panNumber = panNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(
            String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(
            Customer customer) {
        this.customer = customer;
    }
}
