package java_20200512;

class CastingDemo {
	public static void main(String[] args) {
		// byte 범위를 넘어가면 에러 발생
		// 형변환을 하면  에러가 발생하지 않고, circuit 발생 
		byte a = (byte) 128;
		// 형변환 보다는 자료형 선언을 잘 하는게 중요하다
		System.out.println(a);
		
		int b = (int) 123.56;
		// 형변환을 하면 에러가 발생하지 않고, cut 발생 
		// float, double 값을 정수형으로 캐스팅하면 소수점 이하가 잘림!!
		System.out.println(b);
		
		double c;
		c = 154.45d;
		
		c = (int) c;
		System.out.println(c);
		
		double d = (int) 123.56;
		System.out.println(d);
		
		
		
		
		
		
		
			
	}

}
