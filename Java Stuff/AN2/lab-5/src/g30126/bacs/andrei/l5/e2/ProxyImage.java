package g30126.bacs.andrei.l5.e2;

public class ProxyImage implements Image {

	 private Image image;
	   private String fileName,type;
	 
	   public ProxyImage(String fileName, String type){
	      this.fileName = fileName;
	      switch (type) {
		case "real":
			image=new RealImage(fileName);
			break;
		case "rotated":
			image=new RotatedImage(fileName);
		break;
		}
	   }
	 
	   @Override
	   public void display() {
		   image.display();
	   }
	   public static void main(String[] args) {
		ProxyImage proxyImage=new ProxyImage("mere","rotated");
		proxyImage.display();
	}
	}