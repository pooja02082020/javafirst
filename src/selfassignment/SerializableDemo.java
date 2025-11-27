package selfassignment;

import java.io.*;

public class SerializableDemo implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;
	int age;

	public SerializableDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		// ---------- SERIALIZATION ----------
		try {
			SerializableDemo obj = new SerializableDemo("Pooja", 25);

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));

			oos.writeObject(obj);
			oos.close();

			System.out.println("Object Serialized!\n");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// ---------- DESERIALIZATION ----------
		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));

			SerializableDemo obj = (SerializableDemo) ois.readObject();
			ois.close();

			System.out.println("Deserialized Object:");
			System.out.println("Name: " + obj.name);
			System.out.println("Age: " + obj.age);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
