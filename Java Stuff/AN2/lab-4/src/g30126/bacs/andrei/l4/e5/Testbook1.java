package g30126.bacs.andrei.l4.e5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import g30126.bacs.andrei.l4.e4.Author;

public class Testbook1 {
	@Test	
	public void testtoString() {
		Author a1=new Author("mihai", "lalal", 'M');
		Book b=new Book("carte",a1,10);
		assertEquals(b.getName()+"by"+a1.toString(),b.toString());
	}

}
