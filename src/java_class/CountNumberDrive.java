package java_class;

public class CountNumberDrive {
	public static void main(String[] args) {
		CountNumber c1 = new CountNumber();
		c1.setFirst(1000);
		c1.setLast(5000);
		c1.countPrint();
		
		c1.setFirst(1001);
		c1.setLast(5000);
		c1.countPrint();
		
		//for문을 통해서 반복적으로 구할 수 있지 않을까하는 생각~!! 
		//예를들면, 시작과 끝 두 숫자를 넣으면 1 , 10을 넣으면 1과 10사이의 2의배수를 구하는 공식은 어떨까?
		
		
	}

}
