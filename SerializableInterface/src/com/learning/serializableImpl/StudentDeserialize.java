package com.learning.serializableImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\UHL3KOR\\eclipse-workspace\\SerializableInterface\\src\\com\\learning\\serializableImpl\\demo.ser"));
			Student s = (Student) ois.readObject();
			System.out.println(s);
			ois.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
