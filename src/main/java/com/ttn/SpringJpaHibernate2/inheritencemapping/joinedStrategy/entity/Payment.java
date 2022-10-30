package com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double amount;


    public Payment() {
    }

    public Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
