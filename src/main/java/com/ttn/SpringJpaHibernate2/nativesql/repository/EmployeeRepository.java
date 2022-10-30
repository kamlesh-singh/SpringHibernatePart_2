package com.ttn.SpringJpaHibernate2.nativesql.repository;

 import com.ttn.SpringJpaHibernate2.nativesql.entity.Employee;
 import org.springframework.data.jpa.repository.Modifying;
 import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 import org.springframework.data.repository.query.Param;
 import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {


    @Query(value = "select empid,empfirstname,emplastname from employee where emplastname like \"%singh\" ", nativeQuery = true)
    public List<Object[]> findEmployeeByLastName();

    @Modifying
    @Query(value="delete from employee where empage > :eAge",nativeQuery = true)
    public void findDeleteEmployeeByAge(@Param("eAge") int age);
}
