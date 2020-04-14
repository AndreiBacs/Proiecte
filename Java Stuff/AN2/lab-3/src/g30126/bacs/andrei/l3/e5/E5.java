package g30126.bacs.andrei.l3.e5;
import becker.robots.*;

public class E5 {
	public static void main(String[] args)
	{
		City cluj=new City();
		Thing ziar=new Thing(cluj,2,2);
		Robot nelu=new Robot(cluj,1,2,Direction.SOUTH);
		Wall blockAve0 = new Wall(cluj, 1,2, Direction.NORTH);
		Wall blockAve3 = new Wall(cluj, 1,1, Direction.NORTH);
		Wall blockAve4 = new Wall(cluj, 1,1, Direction.WEST);
		Wall blockAve5 = new Wall(cluj, 2,1, Direction.WEST);
		Wall blockAve6 = new Wall(cluj, 2,1, Direction.SOUTH);
		Wall blockAve1 = new Wall(cluj, 1,2, Direction.EAST);
		Wall blockAve7 = new Wall(cluj, 1,2, Direction.SOUTH);
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.move();
		nelu.turnLeft();
		nelu.move();
		nelu.turnLeft();
		nelu.move();
		nelu.pickThing();
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.move();
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.move();
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.turnLeft();
		nelu.move();
		nelu.putThing();

}
}

