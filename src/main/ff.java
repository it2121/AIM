package main;

import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JCheckBox;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Label;

import javax.swing.JLabel;

import sun.awt.image.ImageAccessException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ff {
public static boolean timer = false;
public static boolean sound = false;
	public  static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ff window = new ff();
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
	public ff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		final Checkbox checkbox = new Checkbox("");
		final Checkbox checkbox_1 = new Checkbox("");

		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(2, 29, 40));
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Timer");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setForeground(Color.WHITE);
		label.setBounds(93, 37, 62, 22);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Sound");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setBounds(93, 99, 62, 22);
		frame.getContentPane().add(label_1);
		
		final JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {

				label_2.setIcon(new ImageIcon("playh.png"));
			
			
			}
			public void mouseExited(MouseEvent arg0) {
				
				
				label_2.setIcon(new ImageIcon("play.png"));
			}
			public void mouseClicked(MouseEvent arg0) {
			
				if(checkbox.getState()==true){
				methods.showtimer();
					
				}else if (checkbox.getState()==false){methods.hidetimer();}
				if (checkbox_1.getState()==false) {
					
					face.sound =false;
				}else if (checkbox_1.getState()==true){face.sound = true;}
				
//			face f = null;
//			try {
//				f = new face();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			f.frame.setVisible(true);
//			
			      String[] arguments = new String[] {"123"};
			      face.main(arguments);
			face.label_9.setText("60");
			

			ff.frame.setVisible(false);
		
					
			}
		});
		label_2.setBounds(93, 188, 241, 59);
		frame.getContentPane().add(label_2);
		frame.setBackground(new Color(2, 29, 40));
		frame.setBounds(100, 100, 434, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label_2.setIcon(new ImageIcon("play.png"));
		
		checkbox.setBounds(315, 37, 19, 22);
		frame.getContentPane().add(checkbox);
		
		checkbox_1.setBounds(315, 99, 19, 22);
		frame.getContentPane().add(checkbox_1);
		
		Label label_3 = new Label("----------------------------------\r\n");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_3.setBounds(95, 67, 232, 22);
		frame.getContentPane().add(label_3);
	frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
	}
}
