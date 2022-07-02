package org.phani.frameworks.bdd.model;

import lombok.Data;

import java.util.Map;

public interface WebBrowser {
    Map<String, String> getCapabilities();

    String getName();
}
