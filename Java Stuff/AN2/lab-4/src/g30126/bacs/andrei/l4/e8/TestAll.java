package g30126.bacs.andrei.l4.e8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestAll {
@Test
public void testToStringShape() {
	Shape shape=new Shape("blue", false);
	assertEquals("A Shape with color of blue and not filled", shape.toString());
}
@Test
public void testToStringCircle(){
	Circle circle=new Circle(1,"green", true);
	assertEquals("A Circle with radius 1.0, which is a subclass of A Shape with color of green and filled", circle.toString());
}
@Test
public void testToStringRectangle(){
	Rectangle rectangle=new Rectangle(1,1,"green", true);
	assertEquals("A Rectangle with width=1.0 and length=1.0,which is a subclass of A Shape with color of green and filled", rectangle.toString());
}
@Test
public void testToStringSquare(){
	Square square=new Square(1,"green", true);
	assertEquals("A Square with side=1.0,which is a subclass of A Shape with color of green and filled", square.toString());
}

}
