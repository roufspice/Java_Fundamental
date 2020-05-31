package codingTest;

import java.util.HashMap;
import com.sun.javafx.collections.MappingChange.Map;

public class WordDictionary {
	private String engWord;
	private String korWord;
	HashMap map = new HashMap();
	
	
	public WordDictionary(String engWord, String korWord) {
		this.engWord = engWord;
		this.korWord = korWord;
		

	}
	
	public WordDictionary() {
		
	}
	
	
	public String getEngWord() {
		return engWord;
	}
	public void setEngWord(String engWord) {
		this.engWord = engWord;
	}
	public String getKorWord() {
		return korWord;
	}
	public void setKorWord(String korWord) {
		this.korWord = korWord;
	}

	
	public void addWord(String engWord, String korWord ) {
		map.put(engWord.toLowerCase(),korWord);
		
		
	}
	
	public String find(String engWord) {
		//engWord를 넣으면 
		return (String) map.get(engWord.toLowerCase());
	}

}
