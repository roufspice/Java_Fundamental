package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("c:\\dev\\FileDemo.java");
			fw = new FileWriter("c:\\dev\\FileDemo4.java");
			
			br = new BufferedReader(fr);	//readLine()*****
			bw = new BufferedWriter(fw);	//newLine()
			pw = new PrintWriter(bw,true);	//autoFlush 기능이 가능하다!
			
			String readLine = null;
			//BufferedReader.readline(): 내려쓰기를 제외한 한 줄을 읽는다.
			while((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine(); 	
				//한줄을 내리는 BufferedWriter.newLine()
				
				//pw.println(readLine);
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
					if(br != null) br.close();
					if(bw != null) bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					System.out.println("프로그램 종료!");
				}
		}
		
		
		
		

	}

}
