package codingTest;

public class WordDictionaryDemo {
	public static void main(String[] args) {
		
	WordDictionary dictionary = new WordDictionary();
	dictionary.addWord("Movie", "영화");
    dictionary.addWord("cat", "고양이");
    dictionary.addWord("Dog", "개");
    dictionary.addWord("book", "책");
    dictionary.addWord("soap", "비누");
    dictionary.addWord("Glasses", "안경");
    dictionary.addWord("baSEBall", "야구");
	
    
    System.out.println(dictionary.find("Book"));
    System.out.println(dictionary.find("glasses"));
    System.out.println(dictionary.find("baseball"));
		
	}

}
