package com.ttn.SpringJpaHibernate2.inheritencemapping.singleTableStrategy.repository;


 import com.ttn.SpringJpaHibernate2.inheritencemapping.singleTableStrategy.entity.Payment;
 import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeSingleTableRepository extends CrudRepository<Payment,Integer> {

}
