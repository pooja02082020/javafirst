package fileshandling;

import java.io.*;
import java.util.Scanner;

public class ForCopyingFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("data1.txt");

		FileOutputStream fos = new FileOutputStream("output.txt");

		int data;
		while ((data = fis.read()) != -1) {
			fos.write(data);
		}
		fis.close();
		fos.close();

		Scanner sc = new Scanner(new File("output.txt"));

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

		sc.close();

	}

}
