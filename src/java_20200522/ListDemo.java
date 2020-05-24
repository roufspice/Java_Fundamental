package java_20200522;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 객체의 중복을 허용한다.
		//생성
		ArrayList<Integer> list = new ArrayList<>();
		
		//할당
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);  //List은 중복을 허용한다!
		
		
		
		
		//출력
		for (int i = 0; i < list.size(); i++) {
			Integer i1 = list.get(i);
			System.out.println(i1);
			
			
		}
		//출력 enhanced for loop (Generic으로 선언한 경우만 가능)
		for(int value : list) {
			System.out.println(value);
		}
		
		
		//list 모두 삭제 => remove(int index)
		
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i); // => 지우려는 코드를 적어도 왜 안지워졌을까?
//			
//			
//		}
		
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(0);
//			
//		}
		
		for (int i = 0; i < list.size();) {
			list.remove(0);
			
		}
		
		System.out.println(list);
		
		
		
	}

}
