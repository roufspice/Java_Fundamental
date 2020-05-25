package codingTest;

public class LottoDemo {
	public static void main(String[] args) {
		Lotto l1 = new Lotto();
		
		
		//예외처리는 뭔가 다시 다듬을 필요가 있을것 같다, 최종적으로 나오는 
		//demo버전에서 너무나도 지저분해서 말이지.
		try {
			l1.buyLotto(5);
			l1.buyLotto(-5);
			l1.buyLotto(5);
			
		} catch (IncorrectNumberException e) {
			// TODO Auto-generated catch block
			System.err.println("예외발생");
		} finally {
			System.out.println("종료!");
		}
		
	}

}
