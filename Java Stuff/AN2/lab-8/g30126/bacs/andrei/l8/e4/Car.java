package g30126.bacs.andrei.l8.e4;

import java.io.Serializable;

public class Car implements Serializable {
	private String model;
	private int price;

	public Car(String model,int price) {
		this.model=model;
		this.price=price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return"Masina model "+model+" cu pret "+price;
	}

}
