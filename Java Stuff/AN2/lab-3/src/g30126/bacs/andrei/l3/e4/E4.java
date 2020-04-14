package g30126.bacs.andrei.l3.e4;
import becker.robots.*;
public class E4 {
	public static void main(String[] args)
	{
		City cluj=new City();
		Robot nelu=new Robot(cluj,0,2,Direction.WEST);
		Wall blockAve0 = new Wall(cluj, 1,2, Direction.NORTH);
		Wall blockAve3 = new Wall(cluj, 1,1, Direction.NORTH);
		Wall blockAve1 = new Wall(cluj, 1,2, Direction.EAST);
		Wall blockAve2 = new Wall(cluj, 2,2, Direction.EAST);
		Wall blockAve4 = new Wall(cluj, 1,1, Direction.WEST);
		Wall blockAve5 = new Wall(cluj, 2,1, Direction.WEST);
		Wall blockAve6 = new Wall(cluj, 2,1, Direction.SOUTH);
		Wall blockAve7 = new Wall(cluj, 2,2, Direction.SOUTH);
		nelu.move();
		nelu.move();
		nelu.turnLeft();
		nelu.move();
		nelu.move();
		nelu.move();
		nelu.turnLeft();
		nelu.move();
		nelu.move();
		nelu.move();
		nelu.turnLeft();
		nelu.move();
		nelu.move();
		nelu.move();
		nelu.turnLeft();
		

}
}
