package g30126.bacs.andrei.l10.e4;

import java.util.Random;

public class Robot  extends Thread{
    private int x;
    private int y;
    private int ID;
    private boolean running;
    private static int xLimit = 4;
    private static int yLimit = 4;
    private static Random random;

    public Robot(int ID) {
        super("Robot_" + ID);
        this.random = new Random();
        this.x = random.nextInt(xLimit);
        this.y = random.nextInt(yLimit);
        this.ID = ID;
        this.running = true;
    }

    public void destroyRobot() {
        this.running = false;
    }

    public int getID() {
        return ID;
    }

    public static void setLimit(int limit) {
        xLimit = limit;
        yLimit = limit;
    }

    public static void setxLimit(int xLimit) {
        Robot.xLimit = xLimit;
    }

    public static void setyLimit(int yLimit) {
        Robot.yLimit = yLimit;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void run() {
        int xTmp = x;
        int yTmp = y;
        while (running) {
            do {
                xTmp = -1 + random.nextInt(3);
                xTmp += x;
                if (xTmp >= 0 && xTmp <= xLimit)
                    x = xTmp;
            } while (xTmp < 0 || xTmp > xLimit);

            do {
                yTmp = -1 + random.nextInt(3);
                yTmp += y;
                if (yTmp >= 0 && yTmp <= yLimit)
                    y = yTmp;
            } while (yTmp < 0 || yTmp > yLimit);
            //System.out.println("Deplasare " + this.getName() + " pe: " + this.x + " " + this.y);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
