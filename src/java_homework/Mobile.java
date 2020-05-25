package java_homework;

public class Mobile {
	private String model;
	private int price;
	private int supPrice;
	
	//생성자
	public Mobile(String model, int price, int supPrice) {
		this.model = model;
		this.price= price;
		this.supPrice = supPrice;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSupPrice() {
		return supPrice;
	}

	public void setSupPrice(int supPrice) {
		this.supPrice = supPrice;
	}
	
	

}
