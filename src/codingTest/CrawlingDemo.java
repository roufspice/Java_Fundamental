package codingTest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {

		String url = "http://me2.do/IFwerC1y";

		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();

			Elements dtElements = doc.select("#fileDataList ul dl dt");
//			Elements titleElements = doc.select("span.title");
			for (int i = 0; i < dtElements.size(); i++) {
				Element dtElement = dtElements.get(i);
				System.out.println(dtElement.text());

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



