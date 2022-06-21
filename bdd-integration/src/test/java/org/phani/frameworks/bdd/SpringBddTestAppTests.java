package org.phani.frameworks.bdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBddTestAppTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Value("${details.name}")
    private String env;

    @Test
    void contextLoads() {
        Assertions.assertThat(applicationContext).isNotNull();
        System.out.println("This is current profile: " + env);

    }

}
