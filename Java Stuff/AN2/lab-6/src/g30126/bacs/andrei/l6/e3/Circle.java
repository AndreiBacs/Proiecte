package g30126.bacs.andrei.l6.e3;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape {
	 private Color color;
	    private String id;
	    private boolean filled=false;
	    private int x,y;
		

	public Circle() {
		// TODO Auto-generated constructor stub
	}
	  private int radius;

	    public Circle(Color color, int radius) {
	        this.color=color;
	        this.radius = radius;
	    }

	    public int getRadius() {
	        return radius;
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
