package org.phani.frameworks.bdd.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestEmployee {
    String name;
    String job;
    int experience = 100000;

    public String aboutHim() {
        return "This employee is awesome with experience of " + experience + " years";
    }
}
