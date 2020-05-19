package java_20200519;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.money = 1_000_000_000;
		p.makeMoney();
		p.play("baduk");
		
		System.out.println(p.money);
		
		Child c = new Child();
		c.money = 1_000_000_000;
		c.makeMoney();
		c.chicken = "교촌통닭";
		c.goSchool();
		c.play("soccer");
		
		
		System.out.println(c.money);
		System.out.println(c.chicken);
		
		
		
		
	}

}
