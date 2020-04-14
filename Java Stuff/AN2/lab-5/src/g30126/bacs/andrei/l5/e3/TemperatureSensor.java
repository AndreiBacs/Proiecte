package g30126.bacs.andrei.l5.e3;

import java.util.Random;

public class TemperatureSensor extends Sensor {

	public int readValues() {
		Random random=new Random();
		return random.nextInt(100);
	}

}
