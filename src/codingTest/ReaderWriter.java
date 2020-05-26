package codingTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReaderWriter {
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("c:\\dev\\Array1.java");
			fw = new FileWriter("c:\\dev\\Stream\\Array_copy2.java");
			pw = new PrintWriter(fw, true);
			
			int readCharCount = 0;
			char[] readChars = new char[1024*8];
			
			while((readCharCount = fr.read(readChars)) != -1) {
				pw.write(readChars,0,readCharCount);
				
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
	}

}
