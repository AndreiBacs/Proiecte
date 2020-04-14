package g30126.bacs.andrei.l6.e1;

import java.awt.*;

public class Rectangle extends Shape{

    private int length,width;

    public Rectangle(Color color, int length,int width) {
        super(color);
        this.length = length;
        this.width=width;
    }
    public int getLength() {
		return length;
	}
    public int getWidth() {
		return width;
	}

    @Override
    public void draw(Graphics g) {
        System.out.println("Drawing a rectangel "+length+" "+width+""+getColor().toString()+getId());
        g.setColor(getColor());
        if(isFilled())
        	g.fillRect(getX(), getY(), getWidth(), getLength());
        else
        	g.drawRect(getX(), getY(), getWidth(), getLength());
        g.drawString(getId(), getX(), getY());
    }
}