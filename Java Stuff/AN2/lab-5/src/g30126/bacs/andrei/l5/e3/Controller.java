package g30126.bacs.andrei.l5.e3;

public class Controller {
	TemperatureSensor temperatureSensor;
	LightSensor lightSensor;
	public Controller(TemperatureSensor temperatureSensor,LightSensor lightSensor)
	{
		this.temperatureSensor=temperatureSensor;
		this.lightSensor=lightSensor;
	}
	private void control() {
		int i=0;
		while(i<20) {
			System.out.println(temperatureSensor.readValues());
			System.out.println(lightSensor.readValues());
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.err.println(e);
			}
			i++;
	}}
	public static void main(String[] args) {
		Controller controller=new Controller(new TemperatureSensor(),new LightSensor());
		controller.control();
	}

}
