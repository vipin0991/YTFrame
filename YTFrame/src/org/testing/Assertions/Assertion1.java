package org.testing.Assertions;

import org.testing.Utilities.LogsCapture;

//Soft Assertion class and can be called in test case classes. Currently called in TC3.
public class Assertion1 {
	
	public static void assert_1(String exp, String actual, String tc)
	{
		if(exp.equals(actual)) {
			LogsCapture.takeLogs(tc, "Soft Assertion Passed TC3");
		}
		else {
			LogsCapture.takeLogs(tc, "Failed");
		}
	}

}
