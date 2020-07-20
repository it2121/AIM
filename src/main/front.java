package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Button;
import java.awt.Window.Type;


public class front {

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					front window = new front();
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
	public front() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(2, 29, 40));
		frame.getContentPane().setLayout(null);
		
		Button button = new Button("Play but in another button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ff f= null;
				
				f = new ff();
					
				f.frame.setVisible(true);
				front.frame.setVisible(false);
				
				
				
				
			}
		});
		button.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 20));
		button.setBackground(new Color(16, 62, 85));
		button.setBounds(94, 162, 254, 61);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Play");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ff f= null;
				
				f = new ff();
					
				f.frame.setVisible(true);
				front.frame.setVisible(false);
				
				
				
			}
		});
		button_1.setBackground(new Color(16, 62, 85));
		button_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 20));
		button_1.setBounds(94, 56, 254, 61);
		frame.getContentPane().add(button_1);
		frame.setBackground(new Color(2, 29, 40));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
		// frame.setUndecorated(true);

		
	}
}
