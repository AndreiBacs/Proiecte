package g30126.bacs.andrei.l8.e4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CarFactory {

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}
	Car createCar(String model,int price) {
		Car car=new Car(model, price);
		return car;
	}
	void loadCar(Car car,String storeRecipientName) throws IOException
	{
		ObjectOutputStream oStream=new ObjectOutputStream(new FileOutputStream(storeRecipientName));
		oStream.writeObject(car);
		System.out.println("Scris in fisier");
		oStream.close();
	}
	Car removeCar(String storeRecipientName) throws IOException,ClassNotFoundException
	{
		ObjectInputStream iStream=new ObjectInputStream(new FileInputStream(storeRecipientName));
		Car car=(Car)iStream.readObject();
		System.out.println("Citit din fisier");
		iStream.close();
		return car;
	}
}
