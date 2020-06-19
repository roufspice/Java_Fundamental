package pokemonGo;

public class PokemonGoDemo {
	public static void main(String[] args) {
		
		//태초마을에서 온 한지우, 스타팅 포켓몬으로 지우는 파트너 포켓몬으로 피카츄를 선택했다.
		PokemonDirectory myPd = new PokemonDirectory();
		myPd.pokemonGet("피카츄");
		myPd.pokemonGet("캐터피");
		myPd.pokemonGet("피죤");
		myPd.pokemonGet("깨비참");
		myPd.pokemonGet("칠색조");
		myPd.pokemonGet("꼬부기");
		myPd.pokemonGet("파이리");
		myPd.pokemonGet("이상해씨");
		myPd.pokemonGet("이상해씨");
		
		myPd.loadDirectory();
		
		myPd.pokemonGet("버더플");
		myPd.pokemonGet("야도란");
		myPd.pokemonGet("피존투");
		myPd.pokemonGet("또가스");
		myPd.pokemonGet("라이츄");
		myPd.pokemonGet("나옹");
		myPd.pokemonGet("토게피");
		
		myPd.loadDirectory();
		
		myPd.pokemonGet("리자몽");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
