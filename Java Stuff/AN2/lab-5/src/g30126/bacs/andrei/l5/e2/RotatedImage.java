package g30126.bacs.andrei.l5.e2;

public class RotatedImage implements Image{
	 private String fileName;
	 
	public RotatedImage(String fileName) {
		this.fileName=fileName;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display Rotated " + fileName);
		
	}

}
