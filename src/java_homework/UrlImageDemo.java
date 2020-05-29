package java_homework;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//Jsoup을 써서 크롤링하기
public class UrlImageDemo {
	public static void main(String[] args) throws IOException {

		String url = "https://shop.kt.com/smart/supportAmtList.do";
		Document doc = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		
	
		
			doc = Jsoup.connect(url).get();
			//jsPath : >td.pdImg > img"
			Elements trElements = doc.select(".pdImg img");
			
			for(int i =0; i<trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String imgSrcUrl = trElement.attr("src"); // 해당 이미지 url 가져오기!! 성공!!
				
				System.out.println(imgSrcUrl);
				
				URL imgUrl = new URL(imgSrcUrl);
				InputStream in = imgUrl.openStream();
				bis = new BufferedInputStream(in);
				fos = new FileOutputStream("c:\\dev\\images\\" + "image" + i+1 + ".jpg" );
				
				int readByteCount = 0;
				byte[] readBytes = new byte[1024*8];
				while((readByteCount = bis.read(readBytes))!= -1) {
					fos.write(readBytes,0,readByteCount);
					
				}
				fos.flush();
					
			} 
			bis.close();
			fos.close();
			
			
			
			


	}
}
