package g30126.bacs.andrei.l2.e3;
import java.util.Scanner;

public class E3 {
	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
	  int A = in.nextInt();
	  int B = in.nextInt();
	  prim(A,B);
	}
	static void prim(int A,int B)
	{ 
		int nr=0, flag = 0;
		for(int i=A;i<B;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i % j == 0)
				{
					 flag=0;
					 break;
				}
				else
				{
					flag=1;
				}
					
			}
			if(flag == 1)
			{
				nr++;
				System.out.println("numere prime "+i);
			}
		}
	}
}
