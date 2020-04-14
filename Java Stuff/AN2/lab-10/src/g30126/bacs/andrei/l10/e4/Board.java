package g30126.bacs.andrei.l10.e4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class Board extends Thread {

	  private int dimension;
	    private LinkedList<Robot> robots = new LinkedList<>();
	    private int board[][];

	    public Board(int dimension) {
	        this.dimension = dimension;
	        board = new int[dimension + 1][dimension + 1];
	        Robot.setxLimit(dimension);
	    }

	    public void addRobot(Robot robot) {
	        robots.add(robot);
	        robots.getLast().start();
	    }

	    public void boardInitialization() {
	        for (int i = 0; i <= dimension; i++) {
	            for (int j = 0; j <= dimension; j++) {
	                board[i][j] = 0;
	            }
	        }
	    }

	    public Robot destroyRobotById(int id) {
	        for (Robot x : robots) {
	            if (x.getID() == id) {
	                x.destroyRobot();
	                return x;
	            }
	        }
	        return null;
	    }

	    public void printBoard() {
	        System.out.println("#############");
	        for (int i = 0; i <= dimension; i++) {
	            for (int j = 0; j <= dimension; j++) {
	                if (board[i][j] == 0) {
	                    System.out.print(" _");
	                } else
	                    System.out.print(" " + board[i][j]);
	            }
	            System.out.println();
	        }
	        System.out.println("\n#############");

	    }

	    public void run() {
	        int x;
	        int y;
	        LinkedList<Robot> toBeDeleted = new LinkedList<>();
	        while (true) {
	            boardInitialization();
	            Iterator<Robot> iterator = robots.iterator();
	            while (iterator.hasNext()) {
	                Robot xRobot = iterator.next();
	                synchronized (xRobot) {
	                    x = xRobot.getX();
	                    y = xRobot.getY();
	                }
	                if (board[x][y] == 0)
	                    board[x][y] = xRobot.getID();
	                else {
	                    System.out.println("Robotul " + xRobot.getID() + " a distrus " + board[x][y] + " la pozitia " + x + " " + y);
	                    xRobot.destroyRobot();
	                    iterator.remove();
	                    toBeDeleted.add(destroyRobotById(board[x][y]));
	                    board[x][y] = 0;
	                }
	            }
	            for(Robot a: toBeDeleted){
	                robots.remove(a);
	            }
	            toBeDeleted.clear();
	            printBoard();
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
