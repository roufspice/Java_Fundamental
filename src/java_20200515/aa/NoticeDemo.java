package java_20200515.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n1 = new Notice();
		n1.number = 1; //public
		n1.title = "제목"; //protected
		n1.hit = 100;//default
		//같은 패키지에 있더라고 private 접근 한정자는 접근불가! (클래스 안에서만)
		//private 접근 지정자는 같은 클래스내에서만 접근 가능합니다.
		//n1.regdate = "2020-05-15"; // private
		
	}

}
