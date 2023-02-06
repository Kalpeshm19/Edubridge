package filepack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("Sample.txt");
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getParent());
		
	
		
		
		FileWriter writer=new FileWriter(file);
		BufferedWriter bwriter=new BufferedWriter(writer);
		bwriter.write("Hello this is kalpesh");
		bwriter.close();
		writer.close();
		
		//file.delete();
		System.out.println(file.exists());
		
		
	}

}
