package java_20200527;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//local host의 name과 address를 얻어올 수 잇다.
		InetAddress i = InetAddress.getLocalHost();
		System.out.printf("호스트이름: %s%n",i.getHostName());
		System.out.printf("호스트주소: %s%n",i.getHostAddress());
		
		InetAddress i2 = InetAddress.getByName("naver.com");
		System.out.println(i2.getHostName());
		System.out.println(i2.getHostAddress());
		
		
	}

}
