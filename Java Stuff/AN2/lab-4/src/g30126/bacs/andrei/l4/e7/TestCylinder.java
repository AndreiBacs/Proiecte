package g30126.bacs.andrei.l4.e7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestCylinder {
@Test
public void testGetVolume()
{
	Cylinder cylinder=new Cylinder(10, 10);
	assertEquals( Math.PI*cylinder.getRadius()*cylinder.getHeight(), cylinder.getVolume());
}
}
