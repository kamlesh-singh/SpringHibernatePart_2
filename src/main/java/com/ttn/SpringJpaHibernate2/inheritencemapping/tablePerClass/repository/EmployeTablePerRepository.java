package com.ttn.SpringJpaHibernate2.inheritencemapping.tablePerClass.repository;


import com.ttn.SpringJpaHibernate2.inheritencemapping.tablePerClass.entity.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeTablePerRepository extends CrudRepository<Payment,Integer> {

}
