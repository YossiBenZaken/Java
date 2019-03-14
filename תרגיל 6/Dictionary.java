package java;

public class Dictionary {
	private Word [] arr;
	private int counter=0;
	public Dictionary()
	{
		arr=new Word[1000];
	}
	public String translateFromHebrew(String st)
	{
		for(int i=0;i<counter;i++)
		{
			if(arr[i].getHebrewWord()==st)
			{
				return arr[i].getEnglishWord();
			}
		}
		return null;
	}
	public String translateFromEnglish(String st)
	{
		for(int i=0;i<counter;i++)
		{
			if(arr[i].getEnglishWord()==st)
			{
				return arr[i].getHebrewWord();
			}
		}
		return null;
	}
	public void addWord(Word newWord) {
		arr[counter] = newWord;
		counter++;
	}
	public void showDictionary() {
		for(int i=0;i<counter;i++)
			arr[i].PrintWord();
	}
	public void deleteWord(Word newWord) {
		for(int i=0;i<counter;i++)
		{
			if(newWord.getEnglishWord()==arr[i].getEnglishWord())
			{
				for(;i<counter-1;i++)
					arr[i]=arr[i+1];
				arr[i]=null;
				counter--;
			}
		}
	}
}
