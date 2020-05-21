package java_homework;

public class Chocolate {
	private int price;
	private int size;
	private String brand;
	
	public Chocolate(int prize, int size) {
		this.price = prize;
		this.size = size;
	}
	
	public Chocolate() {
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Chocolate [price=" + price + ", size=" + size + ", brand=" + brand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + size;
		return result;
	}
	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		if (price != other.price)
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	

}
