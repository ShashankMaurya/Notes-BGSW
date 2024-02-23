package com.learning.fileioconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("demo.txt");
			int i = 0;

			while ((i = fin.read()) != -1)
				System.out.print((char) i);
			
			fin.close();
			
//			System.out.println((char) i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
