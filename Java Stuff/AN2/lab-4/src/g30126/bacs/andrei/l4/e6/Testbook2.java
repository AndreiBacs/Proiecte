package g30126.bacs.andrei.l4.e6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import g30126.bacs.andrei.l4.e4.Author;

public class Testbook2 {
	@Test
	public void testToString()
	{
		Author [] a=new Author[2];
		a[0]=new Author("a0","a0@",'m');
		a[1]=new Author("a1","a1@",'f');
		Book book=new Book("b1", a, 10);
		assertEquals("b1by2authors",book.toString());
		
	}
}
