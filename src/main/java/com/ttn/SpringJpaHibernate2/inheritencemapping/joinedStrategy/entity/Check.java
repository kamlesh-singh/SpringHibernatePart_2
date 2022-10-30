package com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "checkpayment")
@PrimaryKeyJoinColumn(name = "id")
public class Check extends Payment {
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
