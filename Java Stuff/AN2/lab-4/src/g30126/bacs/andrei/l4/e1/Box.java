package g30126.bacs.andrei.l4.e1;

public class Box {
	private int id;

    public Box(Conveyor target, int pos, int id){
        this.id = id;
        target.addPackage(this,pos);
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return ""+id;
    }

}
