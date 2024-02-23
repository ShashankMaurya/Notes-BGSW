package com.learning.fileioconcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {

	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("hello2.txt");
			BufferedReader br = new BufferedReader(file);
//			int i = 0;
//			while ((i = br.read()) != -1)
//				System.out.print((char) i);
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
