package java_class;

public class SeparateCollectionDrive {
	public static void main(String[] args) {
		SeparateCollection s1 = new SeparateCollection();
		s1.setDay("금요일");
		System.out.println(s1.getDay());
		s1.isCollectDay();
		s1.setDay("화요일");
		s1.isCollectDay();
	}

}
