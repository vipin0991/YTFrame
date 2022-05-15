package org.testing.Assertions;

import org.testing.Utilities.LogsCapture;

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
