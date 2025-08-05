package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Id
    @ManyToOne
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private Integer quantity;

    protected Security() {

    }

    public Security (Long portfolioId, String name, String category, Double purchasePrice, String purchaseDate, Integer quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return securityId; }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) { this.portfolioId = portfolioId; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) { this.category = category; }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setName(Double purchasePrice) { this.purchasePrice = purchasePrice; }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
