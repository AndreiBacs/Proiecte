package g30126.bacs.andrei.l3.e1;
import becker.robots.*;

public class E1 {
	public static void main(String[] args)
	   {  
	   	// Set up the initial situation
	   	City prague = new City();
	      Thing parcel = new Thing(prague, 1, 3);
	      Robot karel = new Robot(prague, 1, 0, Direction.WEST);
	 
			// Direct the robot to the final situation
	      karel.move();
	      karel.move();
	      karel.move();
	      karel.pickThing();
	      karel.move();
	      karel.turnLeft();	// start turning right as three turn lefts
	      karel.turnLeft();
	      karel.turnLeft();	// finished turning right
	      karel.move();
	      karel.putThing();
	      karel.move();
	   }

}
