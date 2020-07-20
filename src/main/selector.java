package main;

import java.awt.EventQueue;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import javazoom.jl.player.Player;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
public class selector {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selector window = new selector();
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
	public selector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setLayout(null);
		final Label label_1 = new Label("");
		final Label label_2 = new Label("");

		final Label label_3 = new Label("");
		final Label label_5 = new Label("");
	final 	Label label = new Label("");
	// final Clip clip = null ; 
	
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				
				label.setBounds(98-20, 27-20, 664+40, 60+40);
				FileInputStream fileinput = new FileInputStream("sia.mp3");

				Player player = new Player(fileinput);
				player.play();s
				 
			}
			public void mouseExited(MouseEvent arg0) {
				
				label.setBounds(98, 27, 664, 60);

				
			}
		});
		label_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				
				label_1.setBounds(98-20, 114-20, 664+40, 60+40);
				
			}
			public void mouseExited(MouseEvent arg0) {
				
				label_1.setBounds(98, 114, 664, 60);

				
			}
		});
		label_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				
				label_2.setBounds(98-20, 375-20, 664+40, 60+40);
				
			}
			public void mouseExited(MouseEvent arg0) {
				
				label_2.setBounds(98, 375, 664, 60);

				
			}
		});
		label_3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				
				label_3.setBounds(98-20, 201-20, 664+40, 60+40);
				
			}
			public void mouseExited(MouseEvent arg0) {
				
				label_3.setBounds(98, 201, 664, 60);

				
			}
		});
		label_5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				
				label_5.setBounds(98-20, 288-20, 664+40, 60+40);
				
			}
			public void mouseExited(MouseEvent arg0) {
				
				label_5.setBounds(98, 288, 664, 60);

				
			}
		});
		label.setBackground(Color.PINK);
		label.setBounds(98, 27, 664, 60);
		frame.getContentPane().add(label);
		
		label_1.setBackground(Color.RED);
		label_1.setBounds(98, 114, 664, 60);
		frame.getContentPane().add(label_1);
		
		label_2.setBackground(Color.CYAN);
		label_2.setBounds(98, 375, 664, 60);
		frame.getContentPane().add(label_2);
		
		label_3.setBackground(Color.ORANGE);
		label_3.setBounds(98, 201, 664, 60);
		frame.getContentPane().add(label_3);
		
		label_5.setBackground(Color.GREEN);
		label_5.setBounds(98, 288, 664, 60);
		frame.getContentPane().add(label_5);
		frame.setBounds(100, 100, 865, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
