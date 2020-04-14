package g30126.bacs.andrei.l2.e7;
import java.util.*;


public class E7 {
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  int n=0;
	  Random r=new Random();
	  int nr=r.nextInt(100);
	  int i=0;
	  do
	  {
		  System.out.print("dati un nr: ");
		  n=in.nextInt();
		  i++;
		  if(n==nr)
		  {
			  System.out.println("congrats!");  
		  }
		  else if(n<nr)
		  {
			  System.out.println("Wrong answer, your number it too low");
		  }
		  else if(n>nr) 
		  {
			  System.out.println("Wrong answer, your number it too high");
		  }
	
	  }while(n!=nr & i<3);
	  System.out.println("game over!");  
	  
	}
	
}
