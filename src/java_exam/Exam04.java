package java_exam;

import java.util.ArrayList;

public class Exam04 {
	
	public static void main(String[] args) {
		
//		//StringBuffer 클래스 연습
//		
//		StringBuffer sb1 = new StringBuffer();
//		
//		sb1.append("역시 1일 1깡은 해야지~~!!");
//		System.out.println(sb1);
//		
//		sb1.insert(sb1.indexOf("깡"),"새우");
//		System.out.println(sb1);
//		
//		sb1.delete(sb1.indexOf("새"), sb1.indexOf("깡"));
//		System.out.println(sb1);
//		
//		StringBuffer sb2 = new StringBuffer("역시 1일 1깡은 해야지~~!!");
//		System.out.println(sb1 == sb2);
//		System.out.println(sb1.equals(sb2));
////		System.out.println(sb1.hashCode());
////		System.out.println(sb2.hashCode());
//		
//		boolean result = sb1.toString().equals(sb2.toString());
//		System.out.println(result);
//		System.out.println(sb1.toString().hashCode());
//		System.out.println(sb2.toString().hashCode());
//		
//		//.append .insert .delete.toString
//		
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(3);
//		list.add(1);
//		
//		for(Integer value : list) {
//			System.out.print(value + " ");
//		}
//		
//		System.out.println(list.get(0).equals(list.get(2)));
//		
		
		ArrayList<Integer> listDemo = new ArrayList<Integer>();
		listDemo.add(1);
		listDemo.add(2);
		listDemo.add(3);
		listDemo.add(4);
		
		for(int i = 0; i < listDemo.size(); i++) {
			System.out.print(listDemo.get(i) + " ");
		}
		
		String s1 = "123,456";
		s1 = s1.replaceAll(",", "");
		double d1 = Double.parseDouble(s1);
		int a1 = Integer.parseInt(s1);
		
		
		System.out.printf("%,.1f%n",d1);
		System.out.println(a1);
		
	
		
		
		
		
		
		
		
		
		//
		String test ="123,456.45".replaceAll(",", "");
		double d = Double.parseDouble(test);
		
		System.out.println(d);
		
		String test1 = String.format("%,.2f", d);
		System.out.println(test1);
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
