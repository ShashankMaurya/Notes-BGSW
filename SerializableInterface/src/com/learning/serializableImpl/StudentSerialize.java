package com.learning.serializableImpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
					"C:\\Users\\UHL3KOR\\eclipse-workspace\\SerializableInterface\\src\\com\\learning\\serializableImpl\\demo.ser"));

			Student s1 = new Student(1, "Anee", 50000, 200);
			oos.writeObject(s1); // Converted the object to ByteStream for Encryption
			oos.close();

//			OBJECT --serialization--> BYTE_STREAM --deserialization--> OBJECT

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
