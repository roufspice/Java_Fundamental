package codingTest;

import java.util.ArrayList;

public class Main {
	private int n;
	private int k;
	
	public int getSurvivingIndex(int n, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			//생성 및 할당
			list.add(i); //1번군사부터 20번군사를 list에 집어넣음.
			
		}
		//최후의 한명이 남는 순간까지 게임을 반복한다.
		while(n >= 2) {
			for (int i = 1; i <= k-1; i++) {
				list.add(list.get(0));
				list.remove(0);
			}
		}
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("김신은 " + getSurvivingIndex(20,5) + "번 자리에 서있으면 됩니다.");
	}

}
