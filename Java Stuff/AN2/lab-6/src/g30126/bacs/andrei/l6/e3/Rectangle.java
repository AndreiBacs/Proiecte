package g30126.bacs.andrei.l6.e3;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle implements Shape {
	private Color color;
    private String id;
    private boolean filled=false;
    private int x,y;
    private int length,width;


    
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setCoord(int x, int y) {
    	
    	if (x<300)
    		this.x=x;
    	if(y<500)
    		this.y=y;
	}
    public int getX() {
		return x;
	}
    public int getY() {
		return y;
	}
    public void setId(String id) {
		this.id = id;
	}
    public String getId() {
		return id;
	}
    public void setFilled(boolean filled) {
    	this.filled = filled;
    }
    public boolean isFilled() {
    	return filled;
	} 
    public Rectangle(Color color, int length,int width) {
        this.color=color;
        this.length = length;
        this.width=width;
    }
    public int getLength() {
		return length;
	}
    public int getWidth() {
		return width;
	}
    
    public void draw(Graphics g) {
    System.out.println("Drawing a rectangel "+length+" "+width+""+getColor().toString()+getId());
    g.setColor(getColor());
    if(isFilled())
    	g.fillRect(getX(), getY(), getWidth(), getLength());
    else
    	g.drawRect(getX(), getY(), getWidth(), getLength());
    g.drawString(getId(), getX(), getY());
};

}
