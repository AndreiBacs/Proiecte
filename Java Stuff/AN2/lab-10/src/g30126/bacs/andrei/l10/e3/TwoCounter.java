package g30126.bacs.andrei.l10.e3;

public class TwoCounter extends Thread{
	int min,max;
	public TwoCounter(String name) {
		super(name);
		this.min=0;
		this.max=100;
	}
	public TwoCounter(String name,int min,int max) {
		super(name);
		this.min=min;
		this.max=max;
	}
	@Override
	public void run() {
		for(int i=min;i<max;i++)
		{
			System.out.println(getName() + " i = "+i);
            try {
                  Thread.sleep(100);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
		}
		 System.out.println(getName() + " job finalised.");
	}
}
