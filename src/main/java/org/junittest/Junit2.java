package org.junittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Junit1.class})
public class Junit2 {
public static void main(String[] args) {
		
Result runClasses = JUnitCore.runClasses(Junit2.class);
runClasses.getFailureCount();
}
}