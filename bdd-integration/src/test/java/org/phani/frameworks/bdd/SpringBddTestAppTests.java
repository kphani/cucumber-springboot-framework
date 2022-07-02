package org.phani.frameworks.bdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.phani.frameworks.bdd.config.ServiceConfig;
import org.phani.frameworks.bdd.config.TestRunConfig;
import org.phani.frameworks.bdd.model.WebBrowser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBddTestAppTests {

    @Autowired
    ServiceConfig serviceConfig;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private WebBrowser webBrowser;

    @Autowired
    private TestRunConfig testRunConfig;

    @Test
    void contextLoads() {
        Assertions.assertThat(applicationContext).isNotNull();
        System.out.println("Current profile: " + testRunConfig.getName());
        System.out.println(webBrowser.getCapabilities());
        System.out.println(serviceConfig.getConfigs().get("micro1").getPort());

    }

}
