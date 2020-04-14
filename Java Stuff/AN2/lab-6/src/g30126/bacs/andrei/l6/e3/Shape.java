package g30126.bacs.andrei.l6.e3;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {

    public Color getColor();

    public void setColor(Color color);
    public void setCoord(int x, int y);
    public int getX();
    public int getY();
    public void setId(String id);
    public String getId();
    public void setFilled(boolean filled);
    public boolean isFilled();
    public  void draw(Graphics g);
}

