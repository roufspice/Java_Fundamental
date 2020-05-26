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
		
		ArrayList<Mobile> list = mbl.checkList();
		
		for(Mobile m : list) {
			System.out.println(m.getModel());
		}
		int price = list.get(0).getPrice();
		System.out.println(price);
		
		
		
		
		
		
		//호출
		
		
		
		
		}
	}
	


