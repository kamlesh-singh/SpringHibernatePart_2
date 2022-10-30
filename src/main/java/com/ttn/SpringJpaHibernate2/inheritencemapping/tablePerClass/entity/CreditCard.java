package com.ttn.SpringJpaHibernate2.inheritencemapping.tablePerClass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class CreditCard  extends Payment {

    @Column(name = "cardnumber")
    public String creditCard;

    public CreditCard() {
    }

    public CreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCard='" + creditCard + '\'' +
                '}';
    }
}
