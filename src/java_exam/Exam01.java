package java_exam;

public class Exam01 {
	public static void main(String[] args) {
		
		//if문을 switch 문으로 바꾸는 것
		int a = 103;
		if(a%7==1) {
			System.out.println("월요일입니다.");
		} else if(a%7==2) {
			System.out.println("화요일입니다.");
			
		} else if(a%7==3) {
			System.out.println("수요일입니다.");
		} else if(a%7 ==4) {
			System.out.println("목요일입니다.");
		} else if (a%7 ==5) {
			System.out.println("금요일입니다.");
			
		} else if (a%7 == 6) {
			System.out.println("토요일입니다.");
			
		} else {
			System.out.println("일요일입니다.");
			
		}
		
		switch(a%7) {
		case 1: 
			System.out.println("월요일입니다");
		break;
		case 2:
			System.out.println("화요일입니다.");
			break;
		
		case 3: 
			System.out.println("수요일입니다.");
			break;
			
		case 4:
		case 5:
		case 6:
			System.out.println("금요일입니다.");
			break;
		default:
			System.out.println("값이 없습니다");
			
		} 
		
		
		System.out.println("구구단만들기");
		System.out.println();
		
		//for loop를 활용해서
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n",i,j,i*j);
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("while문으로 만드는 구구단");
		
		int m = 2;
		while(m<10) {
			int n = 1;
			while(n<10) {
				System.out.printf("%d * %d = %d%n",m,n,m*n);
				n++;
				
			}
			m++;
			System.out.println();
		}
		
		
		
		
		Exam02 e1 = new Exam02();
		
		
		
		
		
		
		
		
	}

}
