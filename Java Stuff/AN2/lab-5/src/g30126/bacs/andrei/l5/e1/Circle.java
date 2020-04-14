package g30126.bacs.andrei.l5.e1;

class Circle extends Shape{

	   protected double radius;   
	   public Circle(){    }  
	   public Circle(double radius) {

	       this.radius = radius;

	   }   
	   public Circle(String color, boolean filled, double radius) {

	       super(color, filled);

	       this.radius = radius;

	   }   
	   public double getRadius() {

	       return radius;

	   }  
	   public void setRadius(double radius) {

	       this.radius = radius;

	   }  
	   public double getArea() {

	       return Math.PI*getRadius()*getRadius(); //replace with formula for get area

	   }    public double getPerimeter() {

	       return 2*Math.PI*getRadius(); //replace with formula for get perimeter

	   }    @Override

	   public String toString() {

	       return "Circle{" +

	               "color='" + color + '\'' +

	               ", filled=" + filled +

	               ", radius=" + radius +

	               '}';

	   }

	}