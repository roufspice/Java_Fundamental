package pokemonGo;

import java.util.ArrayList;

public class PokemonDirectory {
	ArrayList<Pokemon> pokemonList = new ArrayList<>();

	// 포켓몬 도감에 추가 메소드
	public void pokemonUpdate(String newName) {
		Pokemon p1 = new Pokemon(newName.trim()); // 띄어쓰기 허용하지 않음
		// 첫번째 입력되는 포켓몬
		if (pokemonList.size() == 0) {
			pokemonList.add(p1);
			System.out.printf("%s 을(를) 포켓몬 도감에 등록하였습니다.%n", newName.trim());
			System.out.println("도감에 첫번째 포켓몬을 등록하였습니다!! 축하합니다!!");
			System.out.printf("%s 도감 번호는 '%d'입니다.%n", newName.trim(), pokemonList.size());
			System.out.println("=================================");
		} else {
			// 두번째 입력되는 포켓몬 부터는 중복체크를 한다.
			int i = 0;
			int count = 0;
			while (i < pokemonList.size()) {
				String listName = pokemonList.get(i).getName();
				if (newName == listName) {
					System.out.printf("이미 %s(는)은 도감에 있습니다.%n", newName.trim());
					System.out.println("=================================");
					count++;
					break;

				} else {
					i++;

				}

			}
			if (count != 0) {
				pokemonList.add(p1);
				System.out.printf("%s (을)를 포켓몬 도감에 등록하였습니다.%n", newName.trim());
				System.out.println("등록하신 포켓몬은 등록순서대로 도감번호를 부여받습니다.");
				System.out.printf("%s 도감 번호는 '%d'입니다.%n", newName.trim(), pokemonList.size());
				System.out.println("=================================");

			}

		}

	}

	// 포켓몬 찾기

	public static void main(String[] args) {
		PokemonDirectory pd1 = new PokemonDirectory();
		System.out.println(pd1.pokemonList.size());
	}

}
