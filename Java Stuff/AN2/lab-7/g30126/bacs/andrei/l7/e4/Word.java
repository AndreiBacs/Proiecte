package g30126.bacs.andrei.l7.e4;

public class Word {
	String word;

	public Word(String word) {
		this.word=word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getWord() {
		return word;
	}
	@Override
	public boolean equals(Object obj) {
		Word word=(Word)obj;
		if (word.getWord().equalsIgnoreCase(((Word) obj).getWord()))
            return true;
        return false;
    }
	@Override
	public int hashCode() {
		int sum = 0;
        for (int i = 0 ; i <word.length(); i++){
            sum += word.charAt(i);
        }
        return sum;

	}


}
