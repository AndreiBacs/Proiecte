package g30126.bacs.andrei.l6.e3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingBoard  extends JFrame {

    Shape[] shapes = new Shape[10];
    String id;
    //ArrayList<Shape> shapes = new ArrayList<>();

    public DrawingBoard() {
        super();
        this.setTitle("Drawing board example");
        this.setSize(300,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void addShape(Shape s1){
        for(int i=0;i<shapes.length;i++){
            if(shapes[i]==null){
                shapes[i] = s1;
                break;
            }
        }
//        shapes.add(s1);
        this.repaint();
    }

    public void paint(Graphics g){
        for(int i=0;i<shapes.length;i++){
            if(shapes[i]!=null)
                shapes[i].draw(g);
        }
//        for(Shape s:shapes)
//            s.draw(g);
    }
    public 	void delteById(String id) {
    	  for(int i=0;i<shapes.length;i++){
    		  if(shapes[i].getId().equals(id))
    		  {
    			  shapes[i]=null;
    		  }
    		 repaint();
    	  }
		
	}
}
