package java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//ctrl + shift + o(영문자)
		//1.선언
		HashSet<Integer> set = new HashSet<Integer>(); 
		//<> Generic(제네릭)을 이용하면서 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있다.
		//Generic은 클래스와 인터페이스, 메소드를 정의할 때, 자료형타입을 파라미터로 사용한다 : <Integer> <Long> <String>...
		
		//primitive값을 넣으면서 autoBoxing이 발생한다.
		//HashSet 객체의 중복을 허용하지 않고, 순서 없음.
		//2.할당
		set.add(1);  //Adds the specified element to this set *if it is not already present.*
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(6);
		set.add(7);
		set.add(5);
		
		
		//System.out.println(set.size());  //Removes the specified element from this set if it is present.
		//3.출력
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {					//hasNext() -element가 있으면 true, 없으면 false 반환
			Integer number = i.next(); //next() - element를 반환하고 커서를 아래로 내린다 /  .next():Object를 반환하기 때문에, 호출을 하기위해서는 WrapperClass의 Integer메서드로 형변환을 해야한다.
			System.out.println(number);
			
			}
		
		HashSet<Customer> set1 = new HashSet<Customer>();
		
		//Customer elements를 받아야한다.
		set1.add(new Customer("하대윤1"));
		set1.add(new Customer("하대윤2"));
		set1.add(new Customer("하대윤3"));
		set1.add(new Customer("하대윤1"));
		
		System.out.println("size: " +  set1.size());
		
		
		//로또복권 - HashSet
		
		//TreeSet - 객체의 중복을 허용하지 않음, 오름차순으로 정렬해줌; //class만 HashSet => TreeSet으로 변경!
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		
		while(true) {
			int random = (int) (Math.random()*46);
			lotto.add(random);
			if(lotto.size()==6) break;
			
		}
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		
		
		
			
		}
		
		
	}






