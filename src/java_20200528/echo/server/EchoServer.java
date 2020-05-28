package java_20200528.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private int port;
	public EchoServer(int port) {
		this.port= port;
		
	}
	public void run() {
		ServerSocket serverSocket = null;
		//1. ServerSocket 객체를 생성한다.
		try {
			serverSocket = new ServerSocket(port);
			while(true) {
				System.out.println("클라이언트접속을 기다리고 있습니다.");
				//2.accept() : 클라이언트 접속을 기다리고 있음. 클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket 객체를 생성해줌.
				Socket socket = serverSocket.accept();
				
				//System.out.println("Client와 연결 성공");
				//연결된 client ip주소를 알고 싶을때 사용하는 메소드!!
				InetAddress i = socket.getInetAddress();
				String ip = i.getHostAddress();
				System.out.printf("클라이언트가 접속했습니다[%s]%n",ip);
				
				//5. Socket 객체로 입력스트림을 생성하여 클라이언트 메시지를 읽는다.
				InputStream in = socket.getInputStream();
				//InputStream Reader 스트림 체인 => BufferedReader chain
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				
				System.out.println("클라이언트 메시지: " +readLine );
				
				//6.Socket 객체로 출력 스트림을 생성하여 클라이언트에게 메시지를 다시 보낸다.
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				
				
				
				
				
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EchoServer(3000).run();
		
		
		

	}

}
