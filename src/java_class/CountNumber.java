package java_class;

//5-18배운함수들의 코딩복습하기

public class CountNumber {
	// 두개의 숫자를 넣으면 그사이의 정수의 합을 알려주는 프로그램을 만들고 싶다.!
	
	private long first;
	private long last;
	
	
	//멤버변수인 인스턴스변수 first,last를 공개하지 않고 private으로 선언하며 
	//변동사항은 아래의 메서드 setter, getter를 활용해서 복습한다!!
	public void setFirst(long first) {
		this.first = first;
	}
	public long getFirst() {
		return first;
	}
	
	public void setLast(long last) {
		this.last = last;
	}
	public long getLast() {
		return last;
	}
	
	
	// first와 last사이의 정수들의 합을 더해주는 메소드
	private long getCount() {
		int sum = 0;
		for (long i = first; i <= last - (first - 1); i++) {
			sum += i ;

		}
		return sum;

	}
	
	
	public void countPrint() {
		long sum = getCount();
		System.out.printf("%d부터 %d까지의 정수들의 총합은 %d입니다.%n",first, last, sum );

		
	}
	

}
