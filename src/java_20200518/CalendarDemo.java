package java_20200518;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = new Calendar();
		c.set(2020, 5, 5);
		c.setYear(2025);
		c.print();
		
		
		//setter와 getter 사용예시!
		c.setYear(2021);
		c.print();
		c.setYear(2022);
		c.print();
		System.out.println(c.getYear());
		//외부사람들은 기능만 보고싶지 안의 내용을 궁금해하지 않는다.
		//사용자들이 필요한 정보만 제공한다..
		
	
	}

}
