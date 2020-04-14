package g30126.bacs.andrei.l6.e4;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ImplementCharSequence implementCharSequence=new ImplementCharSequence(new char[] {'a','b','c','d','e','f'});
		for(int i=0;i<implementCharSequence.length();i++)
		{
			System.out.println("Char at "+i+" = "+implementCharSequence.charAt(i));
		}
		System.out.println(implementCharSequence.toString());
		System.out.println("subscventa este: "+implementCharSequence.subSequence(0, 2));
		

}
}