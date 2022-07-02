package org.phani.frameworks.bdd.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Data
@ConfigurationProperties(prefix = "service")
public class ServiceConfig {
    Map<String, ServiceProps> configs;


}
