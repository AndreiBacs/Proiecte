package g30126.bacs.andrei.l8.e4;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		CarFactory carFactory=new CarFactory();
		Car car=carFactory.createCar("Dacia", 10000);
		Car car2=carFactory.createCar("Volvo", 15000);
		carFactory.loadCar(car, "car1.dat");
		carFactory.loadCar(car2, "car2.dat");
		
		Car car3=carFactory.removeCar("car1.dat");
		System.out.println(car3.toString());
		

	}

}
