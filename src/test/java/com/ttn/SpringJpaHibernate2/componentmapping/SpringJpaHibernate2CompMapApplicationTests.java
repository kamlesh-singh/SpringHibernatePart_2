package com.ttn.SpringJpaHibernate2.componentmapping;


 import com.ttn.SpringJpaHibernate2.componentmapping.entity.Employee_component;
 import com.ttn.SpringJpaHibernate2.componentmapping.entity.Name;
import com.ttn.SpringJpaHibernate2.componentmapping.entity.Salary;
import com.ttn.SpringJpaHibernate2.componentmapping.repository.EmployeeRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestEntityManager
class SpringJpaHibernate2CompMapApplicationTests {

    @Autowired
    EmployeeRepository repository;


    @Test
    void contextLoads() {
    }

    @Test
    @Order(value = 1)
    public void testCreate() {
        repository.save(new Employee_component(1, new Name("kamlesh", "singh"), new Salary(32000, 20000, 5000, 20000), 25));
    }

    @Test
    @Order(value = 2)
    public void testGetEmployeeRecord() {
        List<Employee_component> emp = (List<Employee_component>) repository.findAll();
        emp.forEach(System.out::println);

    }


}