package com.ttn.SpringJpaHibernate2.jpql.repository;

 import com.ttn.SpringJpaHibernate2.jpql.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {


    @Query("FROM Employee E WHERE E.empSalary > (SELECT AVG(M.empSalary) FROM Employee M) ORDER BY E.empAge ASC,E.empSalary DESC")
    public  List<Employee> findEmployeeByAvgByempSalery();


    @Query("SELECT AVG(E.empSalary) FROM Employee E")
    public Optional<Double> findAverageSalary();

    @Query("SELECT MIN(E.empSalary) FROM Employee E")
    public Optional<Double> findMinSalary();


    // @Query( "UPDATE Employee E SET E.empSalary =:avgSal WHERE E.empSalary<(SELECT average FROM  (SELECT AVG(M.empSalary) AS average FROM Employee M) )")

    @Modifying
    @Query("UPDATE Employee E SET E.empSalary =:avgSal WHERE E.empSalary < :averageSal")
    public  void findEmployeeSalaryLessThenAVG(@Param("avgSal") double empSalary, @Param("averageSal") double avgSalary);



    @Modifying
    @Query("DELETE FROM Employee E WHERE E.empSalary = :minSal")
    public void findAndDeleteEmpWithMinimumSal(@Param("minSal") double minSalary);
}
