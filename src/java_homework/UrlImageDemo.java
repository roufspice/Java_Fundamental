package java_homework;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//Jsoup을 써서 크롤링하기
public class UrlImageDemo {
	public static void main(String[] args) {

		String url = "https://shop.kt.com/smart/supportAmtList.do";
		FileOutputStream fos = null;
		Document doc = null;

		try {

			Elements trElements = doc.select("#supportAmtList table tbody tr");
			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				Elements imgElement = doc.select(".pdImg img");
				String imgSrcUrl = imgElement.attr("src"); // 해당 이미지 url 가져오기!! 성공!!
				
				System.out.println(imgSrcUrl);
				URL imgUrl = new URL(imgSrcUrl);
				InputStream in = imgUrl.openStream();
				BufferedInputStream bis = new BufferedInputStream(in);

				fos = new FileOutputStream("c:\\dev\\images\\" + "mobile" + 1 + ".png");

				int readByteCount = 0;
				byte[] readBytes = new byte[1024 * 8];
				while ((readByteCount = bis.read(readBytes)) != -1) {
					fos.write(readBytes, 0, readByteCount);
				}

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// document.querySelector("#supportAmtList > table > tbody > tr:nth-child(1) >
			// td.pdImg > img")

		}

	}
}
