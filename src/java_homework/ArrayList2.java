package java_homework;

import java.util.ArrayList;

public class ArrayList2 {
	
	public ArrayList<Student> list(){
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"나연",84));
		list.add(new Student(2,"혜리",94));
		list.add(new Student(3,"유라",80));
		list.add(new Student(4,"쯔위",86));
		
		return list;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList2 l1 = new ArrayList2();
		
		ArrayList<Student> list = l1.list();
		
		//출력
		for(Student stu : list) {
			System.out.print(stu.getMathScore() + " ");
			
		}
	
		
		
		
		
	}
	
	

}
