package com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy;



 import com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.entity.Check;
 import com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.entity.CreditCard;
 import com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.entity.Payment;
 import com.ttn.SpringJpaHibernate2.inheritencemapping.joinedStrategy.repository.EmployeeJoinedTableRepository;
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
class SpringJpaHibernate2JoinedTableApplicationTests {

    @Autowired
    EmployeeJoinedTableRepository employeSingleTableRepository;

    @Test
    @Order(value = 1)
    public void testCreatePayment(){
        Check check = new Check();
        check.setChecknumber("123A");
        check.setAmount(8000);

        CreditCard creditCard = new CreditCard();
        creditCard.setCreditCard("ABC-123");
        creditCard.setAmount(40000);

        employeSingleTableRepository.save(check);
        employeSingleTableRepository.save(creditCard);
    }

    @Test
    @Order(value=2)
    public void testGetPaymentDetails(){
         List<Payment> list = (List<Payment>)employeSingleTableRepository.findAll();
         list.forEach(System.out::println);
    }


}