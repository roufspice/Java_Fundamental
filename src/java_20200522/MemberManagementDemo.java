package java_20200522;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {

	private ArrayList<Member> list = new ArrayList<Member>();
	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
	}
	
	public String input(String str) {
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		return sc.next(); //키보드에서 입력한 데이터를 반환해준다.
	}
	
	public void run(String inputData) {
		if(inputData.equals("1")) {
			insert();
			
		} else if(inputData.equals("2")) {
			update();
			
		} else if(inputData.equals("3")) {
			delete();
			
		} else if(inputData.equals("4")) {
			search();
			
		} else if(inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
			
		} else {
			System.out.println("똑바로해!");
			print();
			String inputD = input("번호를 선택하세요>");
			run(inputD);
			
			
		}
	}
	
	
	//1. 아이디를 입력받는다.
	//2. 이름을 입력받는다.
	//3. ArrayList에 고객을 추가한다.
	//4. ArrayList에 있는 모든 고객을 출력한다.
	//5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	//6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	
	public void insert() {
		//1
		String id = input("아이디>");
		//2
		String name = input("이름>");
		//3
		Member m = new Member(id, name);
		list.add(m);
		//4
		for(Member mem : list) {
			System.out.printf("아이디 : %s , 이름 : %s %n", mem.getId(), mem.getName());
		}
		System.out.println();
		//5
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
		
		
		
	}
	
	//1. 수정할 아이디를 입력받는다.
	//2. ArrayList에 있는 고객정보에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고, 
	//	 ArrayList에 있는 고객정보를 수정한다. 만약, 수정할 아이디가 없으면 '수정할 아이디가 없습니다.' 메시지를 출력한다.
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요 > 메시지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		//1 
		String id = input("수정할 아이디>");
		Member m = new Member(id, null);
		int count = 0;
		
		//System.out.println(list.get(0).getId().equals(m.getId()));
		
		//2 아이디를 찾고, 있으면 수정할 이름을 입력받고, 수정한다.	
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals(m.getId())) { //같은 아이디가 있는지 찾기! 있으면 true값 리턴!
				String newName = input("수정할 이름>");   //수정할 이름을 입력받기!
				list.get(i).setName(newName);
				count++;
			} 
		}
		if(count != 0) {
			System.out.printf("**'%s' 정보 수정완료!**",id);
			System.out.println();
		} else { //오류처리로 만들 수 있지 않을까 싶은데... 받는값이 없으면, 수정할 아이디가 없다고
			System.out.println("**수정할 아이디가 없습니다.**");
			System.out.println();
			
		}
		//3. ArrayList에 있는 모든 고객을 출력한다.
			for(Member mem : list) {
				System.out.printf("아이디 : %s , 이름 : %s %n", mem.getId(), mem.getName());
			}
		//4. print()호출;
			print();
			String inputData = input("번호를 선택하세요>");
			run(inputData);
		}
		
	
	//1. 삭제할 아이디를 입력받는다.
	//2. ArrayList의 Member 객체중에서 삭제할 아이디를 찾아 있으면 삭제하고
	//   없으면 "삭제할 아이디가 없습니다." 메세지를 출력한다.
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다. 
	public void delete() {
		String id = input("삭제할 아이디>");
		//2-1. 아이디를 찾고.
		Member m = new Member(id, null);
		int count = 0;
		
		for(int i = 0; i < list.size();) {
			if(m.getId().equals(list.get(i).getId())) {	// 찾는값이 true면;
				
				list.remove(i);
				
				//제거하면 끝이니까, for loop를 나간다.
				count ++;
			
			} else {
				i++;
			}
		}
		if(count == 0) { //삭제할 아이디가 없다고 하면 되지 않을까나.
			System.out.println("**삭제할 아이디가 없습니다.**");
			System.out.println();
		} else {
			System.out.printf("**아이디 '%s'를 삭제하였습니다.**", id);
			System.out.println();
		}
		
		//3. ArrayList에 있는 모든 고객을 출력한다.
		for (Member mem : list) {
			System.out.printf("아이디 : %s , 이름 : %s %n", mem.getId(), mem.getName());
			
		}
		//4. print()메소드 출력
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
		
		
		
		
	
	}
	//1. 검색할 아이디를 입력 받는다.
	//2. ArrayList에 Member 객체중에서 검색할 아이디를 찾아서 있으면 출력하고
	//   없으면 "검색된 결과가 없습니다." 메세지 출력
	//3. ArrayList에 있는 모든 고객을 출력한다.
	//4. print() 메서드 호출
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다
	public void search() {
		String id = input("아이디>");
		int count = 0;
		//2-2 검색할 아이디를 찾아서 있으면 출력!
		Member m = new Member(id, null);
		for(int i = 0; i<list.size(); i++) {
			if(m.getId().equals(list.get(i).getId())){	//검색한 아이디가 있다
				System.out.printf("검색결과: %s",list.get(i).getId());
				System.out.println();
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("**검색된 결과가 없습니다.**");
			System.out.println();
			
		}
		//3.
		for(Member mem : list) {
			System.out.printf("아이디 : %s , 이름 : %s %n", mem.getId(), mem.getName());
			
		}
		System.out.println();
		//4
		print();
		String inputData = input("번호를 선택하세요>");
		run(inputData);
		
	 
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
		
	}


}

//오류처리를 안배웠기 때문에, int count =0; 0이면 참, 1이면 거짓으로 구분짓고 출력한다는 공식을 대입
