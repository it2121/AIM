package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class readall { 
	public static int[] s = new int[10];
	public static void main(String[] args)throws Exception
	  {
	  // We need to provide file path as the parameter:
	  // double backquote is to avoid compiler interpret words
	  // like \test as \t (ie. as a escape sequence)
	  File file = new File("head.txt");
	 
	  BufferedReader br = new BufferedReader(new FileReader(file));
	 
	  String st;
	  for (int i = 0; i < s.length; i++) {
		
	
	  while ((st = br.readLine()) != null){
		  
		  
		  
		  
	  }
	  }    
	  }
	
	
	//System.out.println(st);
	
	}









