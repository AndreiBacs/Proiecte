package g30126.bacs.andrei.l10.e3;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		TwoCounter counter=new TwoCounter("counter1");
		TwoCounter counter2=new TwoCounter("counter2", 101, 200);
		counter.start();
		counter.join();
		counter2.start();

	}

}
