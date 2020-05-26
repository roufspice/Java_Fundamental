package codingTest;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharStream {
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		try {
			fr = new FileReader("c:\\dev\\test.txt");
			fw = new FileWriter("c:\\dev\\test_copy.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(fw, true);
			
			String str = null;
			//char[] readChars = new char[1024*8];
			
			while((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
				
				
				
			}
			bw.flush();
			
			
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
//					if(br != null) br.close();
//					if(bw != null) bw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
		
	}

}
