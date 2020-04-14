package g30126.bacs.andrei.l6.e4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Test1 {
	@Test
	public void testSubseq()
	{
		ImplementCharSequence implementCharSequence=new ImplementCharSequence(new char[] {'a','b','c','d','e','f'});
		assertEquals("abc", implementCharSequence.subSequence(0,2));
	}


}
