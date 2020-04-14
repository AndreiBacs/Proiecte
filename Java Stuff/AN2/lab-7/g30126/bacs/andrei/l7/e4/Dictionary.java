package g30126.bacs.andrei.l7.e4;

import java.util.Collection;
import java.util.HashMap;


public class Dictionary {
	HashMap<Word, Definition>hashMap;

	public Dictionary(HashMap hashMap) {
		this.hashMap=hashMap;
	}
	
	public void addWord(Word w,Definition d) {
		hashMap.put(w,d);
	}
	public Definition getDefinition(Word w)
	{
		return (Definition)hashMap.get(w);
		
	}
	public void getAllWords() {
		Collection<Word> wordSet=hashMap.keySet();
		System.out.println("words from dictionary are :");
		for(Word x:wordSet)
			  System.out.println(x.getWord());
		
	}
	public void getAllDefinitions() {
		Collection<Definition> definitions=hashMap.values();
		System.out.println("definitions are:");
		for(Definition x:definitions)
		{
			System.out.println(x.getDefinition());
		}
		
	}

}
