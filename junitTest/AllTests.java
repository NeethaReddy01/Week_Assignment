package junitTest;

import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ LoanTest1.class, LoanTest2.class })
public class AllTests {

}
