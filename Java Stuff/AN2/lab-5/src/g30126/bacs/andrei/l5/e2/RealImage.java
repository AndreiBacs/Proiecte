package g30126.bacs.andrei.l5.e2;

public class RealImage implements Image {
	private String fileName;
	
public RealImage(String fileName) {
	// TODO Auto-generated constructor stub
	this.fileName=fileName;
}
@Override
public void display() {
   System.out.println("Displaying " + fileName);
}

private void loadFromDisk(String fileName){
   System.out.println("Loading " + fileName);
}
}
