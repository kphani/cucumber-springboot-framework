package org.phani.frameworks.bdd;


import org.junit.jupiter.api.Disabled;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Disabled
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
public class CucumberRunner3Test {


}
