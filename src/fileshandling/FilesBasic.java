package fileshandling;

import java.io.File;
import java.io.*;

public class FilesBasic {

	public static void main(String[] args) {
		File file = new File("data.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exists");
			}
			System.out.println("Path "+file.getAbsolutePath());
			System.out.println("Size "+file.length());
			System.out.println("Readable? "+file.canRead());
			System.out.println("Writeable? "+file.canWrite());
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		//File writer
		try (FileWriter fw = new FileWriter("data.txt")){
			
			fw.write("Hey this the new file I just created");
			fw.write("\n I am writing something");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("data.txt");
			int ch;
			System.out.println("Read");
			while((ch  = fr.read())!=-1) {
				System.out.print((char)ch+ " ");
			}
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	
	}

}
