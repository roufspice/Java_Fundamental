package pokemonGo;

import java.util.ArrayList;

public class PokemonDirectory {
	ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

	// 포켓몬 도감에 추가 메소드
	public void pokemonGet(String newName) {
		boolean isExisted = false; // 포켓몬이 존재하는가?
		Pokemon p1 = new Pokemon(newName.trim(), 0); // 띄어쓰기 허용하지 않음
		// 첫번째 입력되는 포켓몬
		if (pokemonList.size() == 0) {
			pokemonList.add(p1);
			System.out.printf("'%s' 을(를) 포켓몬 도감에 등록하였습니다.%n", newName);
			System.out.println("도감에 첫번째 포켓몬을 등록하였습니다!! 축하합니다!!");
			System.out.printf("'%s' 도감 번호는 '%d'입니다.%n", newName, 1);
			System.out.println("=================================");
		}
		// 두번째 입력되는 포켓몬 부터는 중복체크를 한다.
		else {
			int i = 0;
			while (i < pokemonList.size()) {
				if (p1.getName().equals(pokemonList.get(i).getName())) { 
					System.out.println("이미 찾은 포켓몬입니다. 도감을 확인해주세요~");
					isExisted = true;
					// 실행하지 않고 밖으로 빠져나온다.
				}
				if (isExisted) {
					break;
				} else {
					i++;
				}
			}
			if (!isExisted) {
				pokemonList.add(p1);
				System.out.printf("'%s' (을)를 새롭게 도감에 등록하였습니다.%n", newName);
			}
		}
		System.out.println("현재 포켓몬도감 찾은 포켓몬 : " + pokemonList.size() + "마리");
		System.out.println("==================================");

	}

	//포켓몬 도감 리스트 뽑아오기!!
	public void loadDirectory() {
		for(int i =0; i<pokemonList.size(); i++) {
			System.out.printf("No.%d %s%n",i+1,pokemonList.get(i).getName());
			
		}
		System.out.println("===================================");
	}
	
	//포켓몬 능력치 수정하기!
	
	
	
	
	
	
	
	
	
	

}
