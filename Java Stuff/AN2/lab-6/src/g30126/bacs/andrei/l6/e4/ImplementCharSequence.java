package g30126.bacs.andrei.l6.e4;

public class ImplementCharSequence implements CharSequence  {
	private char[] sequence;
	public ImplementCharSequence(char[] sequence) {
		this.sequence=sequence;
	}
	@Override
	public int length() {
		return sequence.length;
	}
	@Override
	public char charAt(int index) {
		if (index>-1 && index<sequence.length) {
			return sequence[index];
		}
		else {
			throw new IndexOutOfBoundsException("index invalid"+index);
		}
	}
	@Override
	public String toString() {
		return new String(sequence);
	}
	@Override
	public CharSequence subSequence(int start, int end) {
		if (start>end) 
			throw new IllegalArgumentException("End index must be equal to or great than start index");
		else if(start<0){
			throw new IndexOutOfBoundsException("invalid index"+start);
	}
		else if(end>=sequence.length)
		{
			throw new IndexOutOfBoundsException("invalid index"+end);
		}
	char [] subseq=new char[end-start+1];
	int i=0;
	for(int j=start;j<=end;j++)
	{
		subseq[i++]=sequence[j];
	}
	return new ImplementCharSequence(subseq);
}
}