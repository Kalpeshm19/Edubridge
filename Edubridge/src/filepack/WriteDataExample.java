package filepack;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		for(String s:args)
		{
			System.out.println(s);
		}
		
		
		FileInputStream fileInputStream= new FileInputStream(args[0]);
		BufferedInputStream bufInput= new BufferedInputStream(fileInputStream);
		byte[] array=new byte[20];
		bufInput.read(array);
		bufInput.close();
		fileInputStream.close();
		
		FileOutputStream fout= new FileOutputStream(args[1]);
		BufferedOutputStream bfout=new BufferedOutputStream(fout);
		for(byte b:array)
		{
			System.out.println("---->"+b);
			bfout.write(b);
		}
		bfout.close();
		fout.close(); 
		
		
		/*try {
			char[] byteVal= {65,66,67,68,69,70};
			FileWriter fileWriter= new FileWriter("hello.txt",true);
			fileWriter.write(byteVal,3,2);
			fileWriter.close();
		}catch(IOException ex)
		{
			System.out.println("---> "+ex.getMessage());
		}*/
		
		
			
			/*FileReader reader=new FileReader("MyFile.txt");
			int res=0;
			do {
			res = reader.read();//returns -1 if it reaches end of the file
			System.out.printl((char)res);
			}while(res!=-1);//? asscii value is -1
			*/
			
			}

	}

