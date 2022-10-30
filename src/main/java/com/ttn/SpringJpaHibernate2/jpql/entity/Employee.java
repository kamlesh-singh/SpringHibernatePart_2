package com.ttn.SpringJpaHibernate2.jpql.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int empId;

    private String empFirstName;


    private String empLastName;


    private double empSalary;


    private int empAge;


    public Employee(){

    }

    public Employee(int empId, String empFirstName, String empLastName, double empSalary, int empAge) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public int getAge() {
        return empAge;
    }

    public void setAge(int empAge) {
        this.empAge = empAge;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empSalary=" + empSalary +
                ", age=" + empAge +
                '}';
    }


}
