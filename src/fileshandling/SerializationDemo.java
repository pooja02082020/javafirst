package fileshandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	String name;
	int marks;
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		Student std = new Student();
		std.name = "Pooja";
		std.marks = 75;
		
		//converting object to stream of bytes  --serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("streamofBytes.txt"));
		oos.writeObject(std);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("streamofBytes.txt"));
		//deserialization
		Student s = (Student)ois.readObject(); //casting from stram bytes  to object
		
		System.out.println(s.name + " " + s.marks);
		
		ois.close();
		}
}
