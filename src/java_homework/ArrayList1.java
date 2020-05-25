package java_homework;

import java.util.ArrayList;

public class ArrayList1 {
	
	public ArrayList<Student> list() {
		ArrayList<Student> list = new ArrayList();
		
		list.add(new Student(1, "나연", 85));
		list.add(new Student(2, "정연", 95));
		list.add(new Student(3, "모모", 80));
		list.add(new Student(4, "사나", 85));
		list.add(new Student(5, "지효", 97));
		list.add(new Student(6, "미나", 75));
		list.add(new Student(7, "다현", 70));
		list.add(new Student(8, "채영", 95));
		list.add(new Student(9, "쯔위", 78));
		
		return list;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList1 l1 = new ArrayList1();
		ArrayList<Student> list = l1.list();
		
		for(Student stu :list) {
			System.out.println(stu.getName());
		}
		
		
		
		
		

	}

	
	
	

}
