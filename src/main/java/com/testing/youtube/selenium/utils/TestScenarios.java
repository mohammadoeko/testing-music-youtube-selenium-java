package com.testing.youtube.selenium.utils;

public enum TestScenarios {

    // UPLOAD DATA
    T1("TCC.SignIn.001 URL valid"),
    T2("TCC.SignIn.003 Input email invalid"),
    T3("TCC.SignIn.004 Input email empty"),
    T4("TCC.SignIn.005 Input email valid and password invalid"),
    T5("TCC.SignIn.006 Input email valid and password empty"),
    T6("TCC.SignIn.002 Input email and password valid"),

    // SEARCH DATA
    T7("TCC.Search.001 Input search data and click enter"),
    T8("TCC.Search.002 Input does not match search data and click enter"),
    T9("TCC.Search.003 Input empty search data")

    ;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}

