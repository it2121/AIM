package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class methods {
	
	
	
	public static boolean hs = false;
	static Random num = new Random();
	public static int w() {
		
		
		return num.nextInt(1317)	;
		
	}

	public static int h() {
		
		
		
		return num.nextInt(704);		
	}
	
	
public static void conbest() throws Exception{
	

    String[] arguments = new String[] {"123"};
    read.main(arguments);
    
    if(Integer.parseInt(face.f)> read.big){
    	read.big=Integer.parseInt(face.f);
    	
    	
    	write.content = face.f;
    	
    	  //String[] arguments = new String[] {"123"};
    	    write.main(arguments);
    	
    }
	
}
	public static int hs () throws Exception {
		hs= true;
		
//	      String[] arguments = new String[] {"123"};
	     // read.main(arguments);
		
		
		hs= false;
		
		return read.big;
		
	
		
	}
	public static void showtimer (){face.label_9.setVisible(true);
	face.timerb=true;
	}
public static void hidetimer (){face.label_9.setVisible(false);	face.sound=true;}

public static void setbest() throws Exception{	
    String[] arguments = new String[] {"123"};
    read.main(arguments);
	face.label_11.setText(Integer.toString((int) read.big));}

}



