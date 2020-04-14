package g30126.bacs.andrei.l4.e1;

public class Main {

    public static void main(String[] args) {
        Conveyor cb1 = new Conveyor();
        Box p1 = new Box(cb1, 0, 7);
        Box p2 = new Box(cb1, 10, 3);


        cb1.display();
        cb1.moveRight();
        cb1.display();
        cb1.moveRight();
        cb1.display();
        cb1.moveRight();
        cb1.display();
        cb1.moveRight();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
        cb1.moveLeft();
        cb1.display();
    }

}
