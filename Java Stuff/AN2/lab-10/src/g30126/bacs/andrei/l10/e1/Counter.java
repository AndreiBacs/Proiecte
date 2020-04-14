package g30126.bacs.andrei.l10.e1;

public class Counter extends Thread{

	public Counter(String name) {
		super(name);
	}
    public void run(){
        for(int i=0;i<20;i++){
              System.out.println(getName() + " i = "+i);
              try {
                    Thread.sleep((int)(Math.random() * 1000));
              } catch (InterruptedException e) {
                    e.printStackTrace();
              }
        }
        System.out.println(getName() + " job finalised.");
  }

  public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter("counter1");
        Counter c2 = new Counter("counter2");
        Counter c3 = new Counter("counter3");

        c1.start();
        c2.start();
        c3.start();
  }
}
