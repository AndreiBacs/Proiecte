package g30126.bacs.andrei.l10.e4;

public class Main {

	  public static void main(String[] args) throws InterruptedException {
	        Board board = new Board(5);
	        board.start();
	        board.addRobot(new Robot(1));
	        board.addRobot(new Robot(2));

	        board.addRobot(new Robot(3));
	        board.addRobot(new Robot(4));
	        board.addRobot(new Robot(5));


	        board.join();

	    }
}
