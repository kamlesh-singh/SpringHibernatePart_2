package com.ttn.SpringJpaHibernate2.jpql.repository;

import com.ttn.SpringJpaHibernate2.jpql.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSort extends PagingAndSortingRepository<Employee, Long> {

    Page<Employee> findAll(Pageable pageable);


}