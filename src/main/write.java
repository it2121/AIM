package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write {
	private static final String FILENAME = "head.txt";
public static String  content="";
	public static void main(String[] args) throws IOException {


		FileWriter fw = new FileWriter(FILENAME, true);
		BufferedWriter bw = new BufferedWriter(fw);
		try {


		
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			//bw.newLine();
bw.write(content);



			//System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
