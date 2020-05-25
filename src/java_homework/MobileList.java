package java_homework;

import java.util.ArrayList;

public class MobileList {
	
	//메소드 선언! ArrayList
	public ArrayList<Mobile> checkList(){
		
		ArrayList<Mobile> list = new ArrayList<Mobile>();
		list.add(new Mobile("Galaxy S20 Ultra", 1_595_000, 480_000));
		list.add(new Mobile("Galaxy S20+", 1_353_000, 480_000));
		list.add(new Mobile("Galaxy S20", 1_248_500, 480_000));
		list.add(new Mobile("Galaxy Fold", 1_998_700, 500_000));
		list.add(new Mobile("Galaxy A51 5G", 572_000, 150_000));
		
		return list;
		
	}
	
	public static void main(String[] args) {
		
		MobileList mbl = new MobileList();
		
		ArrayList<Mobile> l1 = mbl.checkList();
		//object를 넣었으니까, 삭제하려면, list.get(0)
		l1.remove(l1.get(0));
		
		int num = l1.size();
		System.out.println(num);
		for (Mobile m : l1) {
			System.out.print(m.getModel() + ",");
			
		}
		
		l1.add(new Mobile("Galaxy S20 Ultra", 1_595_000, 480_000));
		System.out.println();
		
		//main 메소드에서도 추가할 수 있네~~ ArrayList에 g
		for (Mobile m : l1) {
			System.out.print(m.getModel() + ",");
			
		}
		
		
		
		
		
		//호출
		
		
		
		
		}
	}
	


