package com.learning.fileioconcept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("demo.txt");
			String s = "Hello Kids";
			byte b[]=s.getBytes();
			fout.write(b);
			
//			fout.write(65);
			fout.close();
			System.out.println("File Created...");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
