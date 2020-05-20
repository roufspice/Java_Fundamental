package java_20200520;
//1.형변환
public class SubDemo {
	public static void main(String[] args) {
		
		Super s1 = new Sub();
		System.out.println(s1.age);
		s1.playBadook();
		s1.work();
		System.out.println("=====================");
		
		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();//??
		//work()메서드를 오버라이딩 시켜놓음
		
		s2.age = 20;
		System.out.println(s2.age);
		s2.playBadook();
		System.out.println("=====================");
		
		
		Super s3 = new Sub();
		
		//Super s3 = s2;  **메모**
		System.out.println(s3.age);
		//System.out.println(s3.height); //?
		s3.playBadook();
		//s3.playGame(); //?
		
		s3.work(); //?
		
		
		
		
		
	}

}
