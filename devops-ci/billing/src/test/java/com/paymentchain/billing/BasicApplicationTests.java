package com.paymentchain.billing;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.runner.RunWith;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@ExtendWith(MockitoExtension.class)
// @RunWith(SpringRunner.class)
@SpringBootTest
// @ExtendWith(MockitoExtension.class)
public class BasicApplicationTests  {

    @Test
    void contextLoads() {
       String message = "Default Message Cambio Migrar de Laravel a Spring";
        assertNotNull(message);
    }
}
