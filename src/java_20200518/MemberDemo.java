package java_20200518;

public class MemberDemo {
	public static void main(String[] args) {
		
		//객체선언을 통해 setter메서드를 가져온다.
		Member m1 = new Member();
		m1.setName("하대윤");
		m1.setZipcode("1q2w3e4r");
		m1.setAddr1("서울성북구");
		m1.setAddr2("성북로");
		m1.setAge(27);
		m1.setRegdate("2020-05-18");
		m1.setSsn1("11111");
		
		//getter출력하기
		System.out.println(m1.getName());
		System.out.println(m1.getZipcode());
		System.out.println(m1.getAddr1());
		System.out.println(m1.getAddr2());
		System.out.println(m1.getAge());
		System.out.println(m1.getRegdate());
		System.out.println(m1.getSsn1());
		
		
	}
	
	
	
	

}
