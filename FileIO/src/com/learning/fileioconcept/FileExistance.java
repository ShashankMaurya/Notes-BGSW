package com.learning.fileioconcept;

import java.io.File;
import java.io.IOException;

public class FileExistance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file  =  new File("Hello.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());

	}

}
