package com.learning.fileioconcept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			FileWriter fw = new FileWriter("hello2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hellow Kids. Guten Morgen.");
//			fw.write("HelloKids. Good Morning");
//			fw.close();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
