package g30126.bacs.andrei.l4.e8;


public class Shape {
	private String color="red";
	private Boolean filled=true;
	public Shape() {
		this.color="green";
		this.filled=true;
	}
	public  Shape(String color,Boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String isFilled(Boolean filled) {
		if(filled)
		{
			return "filled";
		}
		else
			return "not filled";
	}
	public void setFilled(Boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "A Shape with color of "+getColor()+
				" and "+isFilled(filled);
	}
}
