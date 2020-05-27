package java_20200527;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCrawling {
	public static void main(String[] args) {
		
		String test ="123,456.45".replaceAll(",", "");
		double d = Double.parseDouble(test);
		
		System.out.println(d);
		
		String test1 = String.format("%,.2f", d);
		System.out.println(test1);
		
		
		
		
		//저장할 파일객체 생성
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		String url ="https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200101&end=20200527";
		
		Document doc = null;
		
		
		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\coin_MarketCap.txt");
			bw = new BufferedWriter(fw);
			
			Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");
			System.out.println("날짜\t\t시가\t고가\t저가\t종가\t거래량\t\t시가총액");
			bw.write("날짜\t\t시가\t고가\t저가\t종가\t거래량\t시가총액");
			bw.newLine();
			
			
			//System.out.println("--------------------------------------------------------");
			
			/*
			for(int i =0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				
				Elements tdElements = trElement.select("td");
		
				for (int j = 0; j < tdElements.size(); j++) {
					Element tdElement = tdElements.get(j);
					System.out.print(tdElement.text()+"\t");
				}
				System.out.println();
			}
			*/
			for(int i =0; i <trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text();
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String marketCap = trElement.child(6).text();
				//조작을 하고 싶을 때 아래부분
				
				
				
				System.out.println(date + "\t" + open + "\t" + high + "\t" + low + "\t" + close + "\t" + volume + "\t"+ marketCap );
				bw.write(date + "\t" + open + "\t" + high + "\t" + low + "\t" + close + "\t" + volume + "\t"+ marketCap);
				bw.newLine();
				
			}
			bw.flush();
			

			
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fw != null) fw.close();
					if(bw != null) bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
			
		
	}

}
