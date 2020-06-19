package pokemonGo;

public class PokemonDto {
	
	private int num;
	private String name;
	private String attr;
	
	public PokemonDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PokemonDto(int num, String name, String attr) {
		this.num = num;
		this.name = name;
		this.attr = attr;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

}
