package org.phani.frameworks.bdd.steps;

import io.cucumber.java.en.Given;
import org.assertj.core.api.Assertions;
import org.phani.frameworks.bdd.model.Employee;
import org.phani.frameworks.bdd.model.TestEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FirstSteps {
    @Autowired
    TestEmployee testEmployee;

    @Autowired
    Employee employee;


    @Given("hello step pass")
    public void pass() {
        Assertions.assertThat(employee.getJob()).isEqualTo("Main.father");
        employee.setJob("mother");
        testEmployee.setExperience(2);
        System.out.println("Test Object: " + testEmployee.aboutHim());
        System.out.println("Main object: " + employee.getName());

    }

    @Given("hello step fail")
    public void fail() {
        Assertions.assertThat("phani").endsWith("harshi");
    }


}
