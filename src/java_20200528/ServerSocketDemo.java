package java_20200528;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketDemo {
	public static void main(String[] args) {
		//로컬에서 몇번 포트를 사용하고 있는지 그리고 어느 포트를 사용할 수 있는지 확인할 수 있다.
		ServerSocket serverSocket = null;

		for (int i = 1; i < 65000; i++) {
			try {
				serverSocket = new ServerSocket(i);
				//System.out.println(i + "번 포트를 사용할 수 있습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(i + "번포트를 사용할 수 없습니다.");
			}

		}

	}
}
