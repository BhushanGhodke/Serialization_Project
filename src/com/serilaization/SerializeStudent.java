package com.serilaization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {
	
	public static void main(String[] args) throws IOException {
		
		Student s= new Student();
		s.setId(10);
		s.setFirstname("Bhushan");
		s.setLastname("Ghodke");
		s.setCity("Pune");
		
		FileOutputStream fos= null;
		ObjectOutputStream  oos = null;
		try {
			
			 fos= new FileOutputStream("D:\\ProjectDemo\\Workspace\\Serialization_Project\\Student1.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			System.out.println("Serialization Done");
			
		}catch(Exception e) {
		
			System.out.println(e);
		}
		finally {
			fos.close();
			oos.close();
		}
		
		
	}

}
