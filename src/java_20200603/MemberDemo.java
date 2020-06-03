package java_20200603;

import java.util.ArrayList;

public class MemberDemo {

	public static void main(String[] args) {
		
		MemberDao1 mdao1 = new MemberDao1();
		
		int num = 10;
		String name = "김택진1";
		String addr = "한국1";
		
		//MemberDto m = new MemberDto(num, name, addr);
		/*
		int resultCount = mdao1.insert(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.err.println("등록되지 않습니다.");
		}
		*/
		name = "정용진";
		addr = "이마트";
		
		int resultCount = mdao1.update(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적으로 업데이트 되었습니다.");
		} else {
			System.err.println("오류발생 오류발생!");
		}
		
		mdao1.delete(num);
		mdao1.select();
		
			
		
		/*
		int resultCount = mdao.insert(new MemberDto(num, name, addr));
		//insert를 했을때 결과값을 조건을 달아서 눈으로 볼수 있게 ~ 
		if(resultCount == 1) {
			System.out.println("정상적으로 작동되었습니다.");
		} else {
			System.err.println("정상적으로 작동되지 않습니다.");
		}
		*/
		
		/*
		int resultCount = mdao.update(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적으로 변경되었습니다.");
		} else {
			System.err.println("정상적으로 작동되지 않습니다.");
		}
		*/
		/*
		int resultCount = mdao.delete(num);
			if(resultCount == 1) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.err.println("정상적으로 작동되지 않습니다.");
			}
		*/
		
		/*
		ArrayList<MemberDto> list = mdao.select();
		for(int i =0; i<list.size(); i++) {
//			MemberDto m = (MemberDto) list.get(i);
//			int num1 = m.getNum();
//			String name1 = m.getName();
//			String addr1 = m.getAddr();
			System.out.printf("%d, %s, %s, %n",
					list.get(i).getNum(), 
					list.get(i).getName(), 
					list.get(i).getAddr()
					);
		}
		System.out.println("-----------------------------");
		*/
		
		
		
		
		/*
		for(MemberDto m : list) {
			System.out.printf("%d, %s, %s%n",m.getNum(), m.getName(), m.getAddr());
		}
		
		
		System.out.println("-----------------------------");
		*/
		
		
		/*
		//매개변수로 검색해주세요~ 
		MemberDto mdto = mdao.select(num);
		if(mdto != null) {
			int _num = mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.printf("%d, %s, %s %n",_num,_name,_addr);
		} else {
			System.out.println("회원정보가 없습니다.");
		}
		*/	
		

			
			
		
		
		}
	}


