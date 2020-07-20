package main;
import java.awt.Label;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class timer {
	public static int interval;
	static Timer timer;
public static int timenow=0;
	//public static void main(String[] args) {
	  public static void o(){
	    int delay = 1000;
	    int period = 1000;
	    timer = new Timer();
	    interval = 60;
	   // System.out.println(interval);
	    timer.scheduleAtFixedRate(new TimerTask() {

	        public void run() {
	        
	        	face.label_9.setText(Integer.toString((int) setInterval()));
if (interval ==0){try {
	
	try {
		methods.conbest();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	scor.bests =Integer.toString((int) read.big);
	scor.label_3.setText(scor.bests);

	
	ct();
} catch (InterruptedException e) {}}
	        	
	 
	        }
	    }, delay, period);
	  }

	private static final int setInterval() {
	    if (interval == 1)
	        timer.cancel();
	    return --interval;
	}

public static void ct() throws InterruptedException{

//	face.label_9.setText("mother fucker");
	//face f = new face();
	
	
	
	scor s = new scor();
	face.frame.setVisible(false);
//	 Thread.sleep(550);

	scor.label_1.setText(face.f);
	scor.frame.setVisible(true);
	//Integer.toString((int) Integer.parseInt(label_4.getText())+Integer.parseInt(label_3.getText()) )
	

	
	
	
	face.firsthit=false;
	
}
}
