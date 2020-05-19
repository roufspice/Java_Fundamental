package java_20200519;

public class GarbageCollectiorDemo {
	public static void main(String[] args) {
		Admin a1 = new Admin();
		a1 = new Admin();
		a1 = null;
		//해당 객체의 reference count가 0일때 (참조를 하고 있지 않을때) GC의 대상이됨(다만, 바로 작동하는 것이 아님)
		
		a1 = new Admin();
		Admin a2 = a1;
		a1 = null;
		a2 = null;
		
	}

}
