package pokemonGo;

public class Pokemon {
	
	private String name;	//포켓몬이름
	private String type;	//포켓몬 타입
	private int cp;			//포켓몬 cp
	private int attPower;	//포켓몬 공격력
	private int defPower;	//포켓몬 방어력
	private int hp;			//포켓몬 체력 
	
	//스킬트리
	private String basicSA;			//포켓몬 통상공격 1
	private String basicSB;			//포켓몬 통상공격 2
	
	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public int getAttPower() {
		return attPower;
	}
	public void setAttPower(int attPower) {
		this.attPower = attPower;
	}
	public int getDefPower() {
		return defPower;
	}
	public void setDefPower(int defPower) {
		this.defPower = defPower;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드 : 행동 : 스킬공격
	
	//A스킬트리
	public void attack1() {
		System.out.println(basicSA);
	}
	
	//B스킬트리
	public void attack2() {
		System.out.println(basicSB);
	}
	
	
	
	
	
	
	


}
