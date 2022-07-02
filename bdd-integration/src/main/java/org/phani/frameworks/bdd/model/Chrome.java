package org.phani.frameworks.bdd.model;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class Chrome implements WebBrowser{
    @Override
    public Map<String, String> getCapabilities() {
        return Map.of("browser", getName());
    }

    @Override
    public String getName() {
        return "chrome";
    }
}
