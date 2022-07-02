package org.phani.frameworks.bdd.config;

import org.phani.frameworks.bdd.model.Chrome;
import org.phani.frameworks.bdd.model.Firefox;
import org.phani.frameworks.bdd.model.WebBrowser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    WebBrowser webBrowser;
    @Value("${testrun.browser}")
    private String env;

    @Bean
    WebBrowser webBrowser() {
        if (env.equalsIgnoreCase("firefox")) {
            webBrowser = new Firefox();
        } else {
            webBrowser = new Chrome();
        }
        return webBrowser;

    }
}
