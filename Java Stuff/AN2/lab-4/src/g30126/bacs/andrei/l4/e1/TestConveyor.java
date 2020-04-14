package g30126.bacs.andrei.l4.e1;
import  g30126.bacs.andrei.l4.e1.*;
import  org.junit.*;
import static org.junit.Assert.assertEquals;


public class TestConveyor {
    @Test
    public void shouldAddBox(){
        Conveyor c = new Conveyor();
        Box b = new Box(c,0,1);
        assertEquals(b.getId(), c.getBox(0).getId());
    }

    @Test
    public void shouldMoveBoxToRight(){
        Conveyor c = new Conveyor();
        Box b = new Box(c,1,1);
        c.moveRight();
        assertEquals(b.getId(), c.getBox(2).getId());
    }

    @Test
    public void shouldMoveBoxToLeft(){
        Conveyor c = new Conveyor();
        Box b = new Box(c,1,1);
        c.moveLeft();
        assertEquals(b.getId(), c.getBox(0).getId());

    }

}
