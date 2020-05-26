package java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInOut {
	public static void main(String[] args) {

		InputStream in = System.in;
		InputStreamReader isr = null;
		BufferedReader br = null;

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);

			fw = new FileWriter("c:\\dev\\text.txt");
			bw = new BufferedWriter(fw);

			String readLine = null;
			System.out.println(">>");
			
			while ((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();
				System.out.println(">>");
				
			}
			bw.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

	}

}
