package g30126.bacs.andrei.l2.e6;
import java.util.Scanner;

public class E6 {
	public static void main(String[] args)
	{
		  Scanner in = new Scanner(System.in);
		  int n = in.nextInt();
		  non(n);
		  rec(n);
		  System.out.println("recursiv= "+rec(n));
		  
		
	}
	static void non (int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println("non recursiv= "+f);
	}
	
	static int rec (int n)
	{
		int rez;
		if(n==1)
		{
			return 1;
		}
		else
		{
			return (rec(n-1)*n);
		}
	}

}
