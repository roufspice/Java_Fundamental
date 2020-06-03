package java_20200603;

import java.util.ArrayList;

public class MemberDemo {

	public static void main(String[] args) {
		
		MemberDao1 mdao1 = new MemberDao1();
		int num = 4;
		String name = "PARK1";
		String addr = "러시아1";
		
		
		/*
		int resultCount = mdao1.insert(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("새롭게 입력성공!");
		} else {
			System.err.println("오류발생 오류s발생!");
		}
		*/
		
		/*
		int resultCount = mdao1.update(new MemberDto(num,name,addr));
		if(resultCount == 1) {
			System.out.println("새롭게 업데이트 성공!");
		} else {
			System.err.println("오류발생 오류s발생!");
		}
		*/
//		num = 5;
//		int resultCount = mdao1.delete(num);
		System.out.println("===============");
		
		ArrayList<MemberDto> list = mdao1.select();
		for(int i = 0; i <list.size(); i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d , %s, %s %n",_num, _name, _addr);
		}
		System.out.println("===============");
		
		for(MemberDto m : list) {
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s%n",_num, _name, _addr);
		}
		
		
		
		System.out.println("===============");
		MemberDto mdto = mdao1.select(num);
		if(mdto != null) {
			int _num = mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.printf("%d, %s, %s%n", _num, _name, _addr);
			
		}
		
		
		
		
		

	}
}
