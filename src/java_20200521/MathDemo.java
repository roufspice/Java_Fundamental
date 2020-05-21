package java_20200521;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.ceil(5.5));
		
		
		//Math.ceil()올림 => 출력값 type double
		double d1 = Math.ceil(8.4);
		System.out.println(d1);
		
		//Math.floor()버림 => 출력값 type double
		d1 = Math.floor(8.4);
		System.out.println(d1);
		
		long l1 = Math.round(42.5);
		System.out.println(l1);
		
		d1 = 45.67;
		//소수점 두번째 자리에서 반올림 45.7;
		System.out.printf("%.1f%n", d1); // =>단순히 출력만 하기 위해서는 print.format을 이용하면 반올림값으로 나온다.
		
		d1 = d1*10;
		l1 = Math.round(d1);
		d1 = (double)l1 / 10;
		
		System.out.println(d1);
		
		
		
		
		
		
		
		
	}

}
