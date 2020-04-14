package g30126.bacs.andrei.l2.e4;
import java.util.Random;
import java.util.Scanner;

public class E4 {
	public static void main(String[] args)
	{
		
		 Scanner in = new Scanner(System.in);
		  int n = in.nextInt();
		  int rez = 0;
		  Random r = new Random();
		  
		  int [ ] a = new int[n];
		  for(int i=0;i<a.length-1;i++)
		  {
			  a[i]=r.nextInt(100);
		  }
		  for(int i=0;i<a.length-1;i++)
		  {
			  rez=Math.max(a[i], a[i+1]);
		  }
		  System.out.println(rez);

	}
} 
