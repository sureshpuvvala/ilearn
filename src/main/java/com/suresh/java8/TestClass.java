package com.suresh.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClass {
	
	public static void withOutRecursion(Path input) throws Exception {
		
		long startTime = System.currentTimeMillis();
		// TODO Auto-generated method stub
		
		int largetst = Files.lines(input)
				.mapToInt(String::length)
				.max()
				.getAsInt();
		
		System.out.println("longest Line size: "+largetst);
		
		int smallest = Files.lines(input)
				.mapToInt(String::length)
				.min()
				.getAsInt();
		
		System.out.println("smallest Line size: "+smallest);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time Taken: "+(endTime-startTime)/10+" Secs");
		
	}
	
	public static void withRecursion(Path input) throws Exception{
		
		long startTime = System.currentTimeMillis();
		String longestLine = Files.lines(input)
						     .reduce((x,y)-> {
						    	 if(x.length()>y.length())
						    		 return x;
						    	 return y;
						     })
						     .get();
		System.out.println("longest Line size: "+Integer.parseInt(longestLine));
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken: "+(endTime-startTime)/10+" Secs");
		
	}

	public static void main(String[] args) throws Exception {
		Path input = Paths.get("lines.txt");
		withOutRecursion(input);
		withRecursion(input);
		
		
	   
		
		
		
		
	}

}
