package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class sound {

	
	  public  static void main(String[] args) 
	  {FileInputStream fileinput = new FileInputStream(textField
				.getText());

		Player player = new Player(fileinput);
		player.play();}
		      

		  
	

}

