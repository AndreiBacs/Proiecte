package g30126.bacs.andrei.l10.e5;



public class Consumer extends Thread{
	private Buffer bf;
	public Consumer(Buffer bf) {
		this.bf=bf;
	}
	@Override
	public void run() {
		 while (true)
         {
               System.out.println("Am citit : "+this+" >> "+bf.get());
         }
	}

}
