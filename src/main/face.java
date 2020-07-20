package main;

import main.methods;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Label;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import org.omg.CORBA.INITIALIZE;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.awt.Component;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Box;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class face {
//	public class CountDown {
//
//		Timer timer;
//
//		public CountDown() { timer = new Timer(); timer.schedule(new DisplayCountdown(), 0, 1000); }
//
//		class DisplayCountdown extends TimerTask { int seconds = 60;
//
//		public void run() {
//			// TODO Auto-generated method stub
//			
//		}
//		}
//		}
	public static JFrame frame;
	final static Label label_9 = new Label("60");
	public static  final Label label_11 = new Label("0");

	public static boolean timerb = false;
	public static boolean sound = false;
	final Label label = new Label("");
	final Label label_1 = new Label("");
	static boolean firsthit = false;

	final Label label_5 = new Label("Total:0");

	static String f ="";

	final Label label_3 = new Label("0");
	final Label label_4 = new Label("0");
	private final Label label_10 = new Label("Best score:");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
	
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					face window = new face();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.		public void main(String args[]) { System.out.println("Countdown Beginning"); new CountDown(); } }

	 * @throws InterruptedException 
	 */
	public face() throws InterruptedException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws InterruptedException 
	 * 
	 * 
	 * 
	 */



	
	public static void hit () throws InterruptedException{
		//if(ff.timer == true){
			
			
			
		//}else{label_9.setVisible(false);}

		 Scanner sc = new Scanner(System.in);
			AudioPlayer MGP = AudioPlayer.player;
			AudioStream BGM = null;
		
			try {
				
			
			  InputStream test = new FileInputStream("hit.wav"); //long beep
			  BGM = new AudioStream(test);

//			  System.out.println("Bienvenido al traductor de código Morse.");
//			  System.out.println("Por favor escriba el texto que desea traducir.");
//			  String mensaje = sc.nextLine();
//			  char l;
		//
//			  for(int n = 0; n < mensaje.length(); n++){
//			  //here goes the sounds
//			  l = mensaje.charAt(n);
//			  }
			} catch (Exception e) {
				// TODO: handle exception
			}
			// AudioPlayer.player.start(BGM2);
			// Thread.sleep(200);
		
		 
			AudioPlayer.player.start(BGM);
			 Thread.sleep(550);
				AudioPlayer.player.stop(BGM);
			
		}
	public void initialize() throws InterruptedException {
//		if(ff.timer == true){
//		
//		
//			label_9.setVisible(true);
//		}else{label_9.setVisible(false);}

	

		
				
		frame = new JFrame();
		KeyStroke ea = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
		//Action escapeAction = new AbstractAction(){
		try {
			methods.setbest();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ea ) {
				
			System.exit(0);
			}
		});
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.getContentPane().setLayout(null);
		

				label.setBackground(new Color(255, 0, 255));
				label.setBounds(672, 352, 14, 12);
				frame.getContentPane().add(label);
				
				label.addMouseListener(new MouseAdapter() {			public int r_s = 0;	
				

				
				
					public void mouseClicked(MouseEvent arg0) {
						if(timerb==true){
						if(firsthit == false){timer.o();
				firsthit =true;
				}}
						int x = methods.w();
						int y = methods .h();
						label.setBounds(x, y, 14, 12);
						label_1.setBounds(x-10, y-10, 34, 32);
if(sound == true){	try {
	hit();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}
						r_s+=10;
						 	label_3.setText(Integer.toString((int) r_s +Integer.parseInt(label_3.getText()) ));
					r_s=0;
					f=Integer.toString((int) Integer.parseInt(label_4.getText())+Integer.parseInt(label_3.getText()) );
					label_5.setText("Total:"+f);
					}
				});
		
		label_1.setBackground(new Color(30, 144, 255));
		label_1.setBounds(662, 342, 34, 32);
		frame.getContentPane().add(label_1);
		frame.setLocationRelativeTo(null);
		
		label_4.setForeground(new Color(30, 144, 255));
		label_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_4.setBackground(new Color(51, 51, 51));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(1243, 38, 105, 32);
		frame.getContentPane().add(label_4);
		
		
		
		label_3.setAlignment(Label.CENTER);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_3.setForeground(new Color(255, 20, 147));
		label_3.setBackground(new Color(51, 51, 51));
		label_3.setBounds(1243, 0, 105, 32);
		frame.getContentPane().add(label_3);
		
		label_5.setForeground(new Color(238, 130, 238));
		label_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_5.setBackground(new Color(51, 51, 51));
		label_5.setAlignment(Label.RIGHT);
		label_5.setBounds(1192, 76, 156, 32);
		frame.getContentPane().add(label_5);
		
		Label label_6 = new Label("Red:");
		label_6.setForeground(new Color(255, 20, 147));
		label_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_6.setBackground(new Color(51, 51, 51));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(1182, 0, 55, 32);
		frame.getContentPane().add(label_6);
		
		Label label_7 = new Label("Blue:");
		label_7.setForeground(new Color(30, 144, 255));
		label_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_7.setBackground(new Color(51, 51, 51));
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(1182, 38, 55, 32);
		frame.getContentPane().add(label_7);
		
		Label label_8 = new Label("-------------------------------\r\n");
		label_8.setForeground(new Color(238, 130, 238));
		label_8.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_8.setBackground(new Color(51, 51, 51));
		label_8.setAlignment(Label.RIGHT);
		label_8.setBounds(1158, 56, 190, 32);
		frame.getContentPane().add(label_8);
		label_9.setFont(new Font("Dialog", Font.PLAIN, 29));
		label_9.setAlignment(Label.CENTER);
		label_9.setBackground(new Color(51, 51, 51));
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(10, 10, 46, 42);
		frame.getContentPane().add(label_9);
		label_10.setForeground(new Color(102, 204, 204));
		label_10.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_10.setBackground(new Color(51, 51, 51));
		label_10.setAlignment(Label.CENTER);
		label_10.setBounds(587, 0, 89, 32);
		
		frame.getContentPane().add(label_10);
		label_11.setForeground(new Color(102, 204, 204));
		label_11.setFont(new Font("Dialog", Font.PLAIN, 15));
		label_11.setBackground(new Color(51, 51, 51));
		label_11.setAlignment(Label.CENTER);
		label_11.setBounds(682, 0, 105, 32);
		
		frame.getContentPane().add(label_11);
		
		Label label_2 = new Label("---------------");
		label_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
				
				
				
				int x = methods.w();
				int y = methods .h();
				label.setBounds(x, y, 14, 12);
				label_1.setBounds(x-10, y-10, 34, 32);
				
			}
		});
		label_2.setBackground(new Color(51, 51, 51));
		label_2.setBounds(0, 0, width, height);
		frame.getContentPane().add(label_2);
		frame.setForeground(Color.DARK_GRAY);
		frame.setBounds(0, 20, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		label_1.addMouseListener(new MouseAdapter() {public int y_s=0;
			public void mouseClicked(MouseEvent arg0) {
			if(timerb==true){	
				if(firsthit == false){timer.o();
				firsthit =true;
				}
				
			}
				int x = methods.w();
				int y = methods .h();
				label.setBounds(x, y, 14, 12);
				label_1.setBounds(x-10, y-10, 34, 32);
				y_s+=5;
			 	label_4.setText(Integer.toString((int) (
			 			y_s+Integer.parseInt(label_4.getText())))
			 			
			 			);
	 		y_s=0;
	 		f=Integer.toString((int) Integer.parseInt(label_4.getText())+Integer.parseInt(label_3.getText()) );
			label_5.setText("Total:"+f);


			}
		});
		
		
		
	}
	
}
