package java;

public class Word {
	private String hebrewWord,englishWord;
	
	public Word(String hebWord,String engWord) {
		hebrewWord = hebWord;
		englishWord = engWord;
	}
	public Word(Word other)
	{
		hebrewWord = other.hebrewWord;
		englishWord = other.englishWord;
	}
	public String getHebrewWord() {
		return hebrewWord;
	}
	public String getEnglishWord() {
		return englishWord;
	}
	public void setHebrewWord(String hebWord) {
		 hebrewWord = hebWord;
	}
	public void setEnglishWord(String engWord) {
		englishWord = engWord;
	}
	public void PrintWord() {
		System.out.println(englishWord + " = "+hebrewWord);
	}
}
