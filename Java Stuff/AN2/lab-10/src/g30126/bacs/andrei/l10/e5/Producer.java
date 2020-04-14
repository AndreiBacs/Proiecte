package g30126.bacs.andrei.l10.e5;

public class Producer implements Runnable {
	private Buffer bf;
	private Thread thread;
	public Producer(Buffer bf) {
		this.bf=bf;
	}
	public void start() {
		if(thread==null)
		{
			thread=new Thread(this);
			thread.start();
		}
	}

	@Override
	public void run() {
		while(true)
		{
            bf.push(Math.random());
            System.out.println("Am scris.");
            try
            {
            	Thread.sleep(1000);
            }
            catch(Exception e){}
		}

	}

}
