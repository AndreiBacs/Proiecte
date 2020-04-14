package g30126.bacs.andrei.l7.e4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		
		HashMap<Word, Definition>hMap=new HashMap<>();
		Dictionary dictionary=new Dictionary(hMap);
		char answer;
		String linie,explic;
		BufferedReader fluxIn=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("meniu:");
			System.out.println("a- Add word");
			System.out.println("d- Show definition");
			System.out.println("w- All words");
			System.out.println("q- All definitionsa");
			System.out.println("e- Exit");
			linie=fluxIn.readLine();
			answer=linie.charAt(0);
			switch (answer) {
			case 'a':case 'A':
				System.out.println("Enter word:");
				linie=fluxIn.readLine();
				if(linie.length()>1) {
					System.out.println("Enter definition:");
					explic=fluxIn.readLine();
					dictionary.addWord(new Word(linie), new Definition(explic));
				}
				break;
			case 'd':case 'D':
				System.out.println("Search word:");
				linie=fluxIn.readLine();
				if(linie.length()>1)
				{
					Definition explic1 = dictionary.getDefinition(new Word(linie));
					if (explic1 ==null) 
						System.out.println("Word not found!");
					else
						System.out.println("Definition:"+explic1.getDefinition());
				}
				break;
			case 'w':case'W':
			{
				dictionary.getAllWords();
				break;
			}
			case 'q':case'Q':
			{
				dictionary.getAllDefinitions();
			}
			}
		}while(answer!='e' && answer!='E');
		System.out.println("Program terminat.");
		

	}

}
