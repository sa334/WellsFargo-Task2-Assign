package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio(long clientId,Date creationDate){
        this.clientId = clientId;
        this.creationDate = creationDate;
    }
    public Long getPortfolioId() { return portfolioId;}

    public Long getClientId() {return clientId;}

    public void setClientIdId(long clientId) {this.clientId = clientId;}

    public Date getCreationDate() {return creationDate;}

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
