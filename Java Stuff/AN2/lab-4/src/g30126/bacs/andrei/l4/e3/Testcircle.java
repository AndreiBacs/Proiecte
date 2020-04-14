package g30126.bacs.andrei.l4.e3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testcircle {
	@Test
	public void testGetArea() {
	Circle c=new Circle();
	assertEquals(Math.PI*c.getRadius(), c.getArea(),0.01);
	}

}
