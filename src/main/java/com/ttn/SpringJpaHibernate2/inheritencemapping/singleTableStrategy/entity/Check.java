package com.ttn.SpringJpaHibernate2.inheritencemapping.singleTableStrategy.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Check extends  Payment{
    @Column(name = "checknumber")
    private String checknumber;


    public Check() {
        super();
    }

    public Check(String checknumber) {
        super();
        this.checknumber = checknumber;
    }

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }

    @Override
    public String toString() {
        return "Check{" +
                "checknumber='" + checknumber + '\'' +
                '}';
    }
}
