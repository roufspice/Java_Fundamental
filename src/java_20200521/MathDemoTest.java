package java_20200521;

public class MathDemoTest {
	public static void main(String[] args) {
		double d1 = Math.ceil(45.56);
		double d2 = Math.floor(85.545);
		
		System.out.println(d1+d2); //46+85
		
		double d3 = Math.round(45.45);
		System.out.println(d3);
		
		double d4 = 45.67;
		//소수 두번째짜리에서 반올림!
		d4 = d4 * 10; //456.7
		d4 = Math.round(d4); //457
		d4 = d4 / 10;
		System.out.println(d4);
		
		Customer c1 = new Customer("하대윤", "성북구");
		System.out.println(c1);
		
		
		
		
	}

}
