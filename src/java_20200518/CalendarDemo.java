package java_20200518;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c1 = new Calendar();
		c1.set(2020, 5, 5);
		c1.print();
		
		
		//setter와 getter 사용예시!
		c1.setYear(2021);
		c1.print();
		c1.setYear(2022);
		c1.print();
		System.out.println(c1.getYear());
		//외부사람들은 기능만 보고싶지 안의 내용을 궁금해하지 않는다.
		//사용자들이 필요한 정보만 제공한다..
		
		
	}

}
