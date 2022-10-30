package com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.repository;


  import com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.entity.Payment;
  import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJoinedTableRepository extends CrudRepository<Payment,Integer> {

}
