package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scor {

	public static  JFrame frame;
	public static Label label_3 = new Label("");

	public static String bests="ass";
	static  Label label_1 = new Label("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scor window = new scor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public  void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Your score");
		label.setForeground(Color.WHITE);
		label.setBounds(88, 37, 62, 22);
		frame.getContentPane().add(label);
		
		//Label label_1 = new Label("4576");
		label_1.setAlignment(Label.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(223, 37, 62, 22);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Best score");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(88, 65, 62, 22);
		frame.getContentPane().add(label_2);
		label_3.setAlignment(Label.CENTER);
		
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(223, 65, 62, 22);
		frame.getContentPane().add(label_3);
		
		Button button = new Button("Play again");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				ff.frame.setVisible(true);
				scor.frame.setVisible(false);
				
			}
		});
		
		button.setBounds(194, 194, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_2 = new Button("Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);	
				
				
			}
		});
		button_2.setBounds(194, 240, 70, 22);
		
		frame.getContentPane().add(button_2);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
	}
}
