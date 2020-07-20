package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class read {
	
	public static int big=0;
	
	
	public static void main(String[] args)throws Exception
	  {
	  // We need to provide file path as the parameter:
	  // double backquote is to avoid compiler interpret words
	  // like \test as \t (ie. as a escape sequence)
	  File file = new File("head.txt");
	 
	  BufferedReader br = new BufferedReader(new FileReader(file));
	 
	  String st;
	  while ((st = br.readLine()) != null){
	 
		  
			
    big = Integer.parseInt(st);
		 	  
	  }
	  

	
	
	
	
	
	
	
	
	
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int big=0; 
//	 
//
//	public static void main(String[] args) throws Exception
//	  {
//	    // pass the path to the file as a parameter
//	  
//		
//		File file =
//	      new File("head.txt");
//	    Scanner sc = new Scanner(file);
//	 
//	    while (sc.hasNextInt()){
//	    //	if(methods.hs==false){
//	    		
//	    	 	if(big<Integer.parseInt(sc.next())){
//	    		     big = Integer.parseInt(sc.next());
//	    		     
//	    	 	}
//	    		    	}
//    
//   		     
//   	
//
//	    	
//	    System.out.print(big);
//	   
//
//
//	  }




	  
}
