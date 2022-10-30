package com.ttn.SpringJpaHibernate2.componentmapping.repository;


 import com.ttn.SpringJpaHibernate2.componentmapping.entity.Employee_component;
 import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee_component,Integer> {

}
