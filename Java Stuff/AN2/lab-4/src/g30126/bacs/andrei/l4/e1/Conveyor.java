package g30126.bacs.andrei.l4.e1;

public class Conveyor {
	 private Box[] packages = new Box[30];

	    void addPackage(Box p, int pos){
	        packages[pos] = p;
	    }

	    public void moveLeft(){
	        for(int i=1;i<packages.length-1;i++){
	            packages[i] = packages[i+1];
	        }
	        packages[packages.length-1] = null;

	    }

	    public void moveRight() {
	        for (int i = packages.length - 1; i > 0; i--) {
	            packages[i] = packages[i - 1];
	        }
	        packages[0] = null;
	    }

	    public Box getBox(int pos){
	        return packages[pos];
	    }

	    public void display(){
	        for (int i = 0; i < packages.length; i++) {
	            String c = (packages[i]!=null)?packages[i].toString():"_";
	            System.out.print(c);
	        }
	        System.out.println();
	    }

}
