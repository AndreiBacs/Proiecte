package g30126.bacs.andrei.l6.e1;

import java.awt.*;

public class Circle extends Shape{

    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a circle "+this.radius+" "+getColor().toString()+getId());
        g.setColor(getColor());
        if(isFilled())
        	g.fillOval(getX(), getY(), radius, radius);
        else 
        g.drawOval(getX(),getY(),radius,radius);
        g.drawString(getId(), getX(), getY());
    }
}
