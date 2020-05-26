package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputEx {
	public static void main(String[] args) {
		FileInputStream f1 = null;
		FileOutputStream f2 = null;

		try {
			f1 = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			f2 = new FileOutputStream("c:\\dev\\jdk_copy.exe");

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8];

			while ((readByteCount = f1.read(readBytes)) != -1) {
				f2.write(readBytes, 0, readByteCount);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (f1 != null)
					f1.close();
				if (f2 != null)
					f2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("예외발생!");
			} finally {
				System.out.println("실행 완료!");
			}

		}

	}

}
