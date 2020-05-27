package java_20200527;
//네이버 금융 웹페이지 크롤링 해보기~!!
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverFinance {
	public static void main(String[] args) {

		String url = "https://finance.naver.com//item/sise_day.nhn?code=035720";  //정확한 url찾기와

		Document doc = null;
		try {

			doc = Jsoup.connect(url).get();
			Elements trElements = doc.select(".type2 tbody tr"); //핵심은 여기에 있음!!!
			System.out.println("날짜\t\t종가\t전일비\t시가\t고가\t저가\t거래량");

			for (int i = 0; i < trElements.size(); i++) {
				if (i == 0 || i == 1 || i == 7 || i == 8 || i == 9 || i == 15) {
					continue;
				} else {
					Element trElement = trElements.get(i);
					String date = trElement.child(0).text();
					String end = trElement.child(1).text();
					String beforeR = trElement.child(2).text();
					String start = trElement.child(3).text();
					String high = trElement.child(4).text();
					String low = trElement.child(5).text();
					String volume = trElement.child(6).text();

					System.out.println(date + "\t" + end + "\t" + beforeR + "\t" + start + "\t" + high + "\t" + low
							+ "\t" + volume);
				}
			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
