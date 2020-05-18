package java_20200518;

public class VarArgDemo {
	
	
	
	
	public void print(int... a) { //variable arguments
		// a 변수는 배열로 처리함.
		int length = a.length;
		
		for (int value : a) {
			System.out.printf("%d ",value);
		}
		System.out.println(); //내려쓰기
		System.out.printf("배열 수: %s개%n",length);
		System.out.println();
	}
	
	//*추가
	public void add(String...strings) {
		for (String string : strings) {
			System.out.print(string + " ");
			
		}
		System.out.println();
		
		}
		
			
		
		
	
	
	public static void main(String[] args) {
		//class의 구성요소는 멤버변수, 메서드, 생성자;
		 VarArgDemo v1 = new VarArgDemo();
		 v1.print(1,2,3);
		 v1.print(4,5,6,7);
		 v1.print(3094,5929,2323,46);
		 v1.add("개구리", "올챙이","영구리");
		
		 
		 
		 VarArgDemo v2 = new VarArgDemo();
		 v2.print(11,12,13);
		 
		 
		 
		
		 
		 
		 
		 
		
		
	}
	

}
