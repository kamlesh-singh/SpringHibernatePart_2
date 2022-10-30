package com.ttn.SpringJpaHibernate2.componentmapping.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee_component")
public class Employee_component {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "firstName", column = @Column(name = "firstname")),
            @AttributeOverride(name = "lastName", column = @Column(name = "lastname"))
    })
    private Name name;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "basicSalary", column = @Column(name = "basicsalary")),
            @AttributeOverride(name = "bonusSalary", column = @Column(name = "bonussalary")),
            @AttributeOverride(name = "taxAmount", column = @Column(name = "taxamount")),
            @AttributeOverride(name = "specialAllowanceSalary", column = @Column(name = "specialallowancesalary"))
    })
    private Salary salary;

    @Column(name = "age")
    private int age;

    public Employee_component() {
    }

    public Employee_component(int id, Name name, Salary salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
