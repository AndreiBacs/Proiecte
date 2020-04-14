package g30126.bacs.andrei.l6.e1;

import java.awt.*;

public abstract class Shape {

    private Color color;
    private String id;
    private boolean filled=false;
    private int x,y;

    public Shape(Color color) {
        this.color = color;
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

    public abstract void draw(Graphics g);
}

