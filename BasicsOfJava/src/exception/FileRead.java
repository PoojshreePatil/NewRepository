package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	
	static void readFileData() throws IOException
	{
		FileInputStream fis = new FileInputStream("D://Test.txt");
		int i;
		while((i = fis.read()) != -1)
		{
			System.out.print((char) i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		
		readFileData();
		System.out.println("Done");
	}
}
