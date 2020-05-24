//2 call by value, call by reference
package java_20200519;

public class CallRefValueDemo {
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 2000;

	}

	public static void main(String[] args) {
	
		int i = 10;
		int[] j = new int[] { 1, 2, 3, 4 };

		System.out.println(i + "," + j[3]);    //10,4


		change(i, j);  // i=> call by value, j=> call by reference	

		System.out.println(i + "," + j[3]); //10,2000
		System.out.println(j[0]); 
		
		int a = 10;
		double b = 10.0;
		//primitive == primitive => 값비교
		System.out.println(a==b);  //primitive 변수끼리는 값을 비교한다.
		
		int[] a1 = {1,2,3,4};
		int[] b1 = {1,2,3,4};
		int[] c1 = a1;
		
		//ref == ref => 두 ref가 같은 객체를 참조하는지를 판단한다. //값이 아닌, 참조하는 포인터를 비교한다. //다만, 객체안의 값을 참조하고 싶다면, .equals() 클래스를 사용해야 한다.
		//같은 객체를 참조하면 true, 같은 객체를 참조하지 않으면 false
		System.out.println(a1 == b1);
		
		a1 = b1;
		System.out.println(a1 == b1);
		System.out.println(c1 == b1);
		System.out.println(a1 == c1);
		
		
	
		
		
		}

	}

