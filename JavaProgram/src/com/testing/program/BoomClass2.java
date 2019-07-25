package com.testing.program;

public class BoomClass2 {
	 static String s = "AAA";
	 
	    static
	    {
	        s = s + "BBB";
	    }
	 
	    {
	        s = "AAABBB";
	    }

}
