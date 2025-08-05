package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Id
    @ManyToOne
    private long clientId;

    @Column(nullable = false)
    private String creationDate; // I'm not sure if there is a better type for dates that I should use here

    protected Portfolio() {

    }

    public Portfolio (Long clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) { this.clientId = clientId; }

    public String getCreationDate() {
        return creationDate;
    }

    public void setFirstName(String creationDate) {
        this.creationDate = creationDate;
    }

}
