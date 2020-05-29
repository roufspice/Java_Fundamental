package java_exam;

public class exam1 {
	public static void main(String[] args) {
		
		//구구단 for loop문으로 만들기
		
		for(int i =2; i < 10; i++) {
			for (int j = 1; j<10; j++) {
				System.out.printf("%d X %d = %d%n",i,j,i*j );
				
			}
			System.out.println();
			
			
		//while문으로 바꾸기
			
			int k = 2;
			int l = 1;
			while(k<10) {
				l = 1;
				while(l < k) {
					System.out.printf("%d X %d = %d%n",k,l,k*l );
					l++;
				}
				k++;
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
