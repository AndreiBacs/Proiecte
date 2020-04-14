package g30126.bacs.andrei.l6.e5;

import java.awt.Color;

import g30126.bacs.andrei.l6.e1.DrawingBoard;
import g30126.bacs.andrei.l6.e1.Rectangle;
import g30126.bacs.andrei.l6.e1.Shape;


public class Pyramid extends Rectangle{
	
	public Pyramid(Color color, int length, int width) {
		super(color, length, width);
		// TODO Auto-generated constructor stub
	}
	private static final int nr = 5;
	private static final int width = 32;
	private static final int length = 15;
	
	public static void createPyramid() {
		
		DrawingBoard b1 = new DrawingBoard();
		int i,j,c=0,k=nr;
		
		for(i=0;i<k;i++) {			
			for(j=i;j>0;j--) {
				Shape brick = new Rectangle(Color.BLUE,width,length);
				brick.setCoord(100+length*(j+1)+(k-i)*length/2 ,300-width*(k-i+1));
				brick.setFilled(false);
				brick.setId(" ");
				b1.addShape(brick);
				c++;
				
			}
		} 
	}
	public static void main(String[] args) {
		createPyramid();
	}
}