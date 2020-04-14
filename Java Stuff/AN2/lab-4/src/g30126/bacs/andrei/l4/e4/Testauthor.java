package g30126.bacs.andrei.l4.e4;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
public class Testauthor {
	@Test
	public void testToSting() {
		Author a=new Author("gigi","gigi@gigi.com",'M');
		assertEquals(a.getName()+"("+a.getGender()+")"+" at "+a.getEmail(),a.toString());
		}
}
