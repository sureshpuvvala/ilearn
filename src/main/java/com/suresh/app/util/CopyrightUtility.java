package com.suresh.app.util;

public class CopyrightUtility {
	
	public static void main(String ...args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("This tool adds the copyright information to the source files")
		.append(System.lineSeparator())
		.append("The mandatory parameter is Org Name\t and the Optional Params are\n")
		.append("startyear, endyear, custome message\n");
		
		if(args.length==0) {
			System.out.println(sb.toString());
	        
		}
		
	}

}
