package g30126.bacs.andrei.l6.e1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        DrawingBoard b1 = new DrawingBoard();
        Shape s1 = new Circle(Color.RED, 90);
        s1.setId("lala");
        s1.setCoord(50, 50);
        b1.addShape(s1);
        Shape s2 = new Circle(Color.GREEN, 100);
        s2.setId("a2");
        s2.setCoord(30, 70);
        s2.setFilled(true);
        b1.addShape(s2);
        Shape s3=new Rectangle(Color.black, 50, 50);
        s3.setCoord(50, 150);
        s3.setFilled(true);
        s3.setId("a1");
        b1.addShape(s3);
        b1.delteById("lala");
    }
}
