package g30126.bacs.andrei.l2.e2;
import java.util.Scanner;
public class E2 {
	public static void main(String[] args)
	{
		  Scanner in = new Scanner(System.in);
		  int x = in.nextInt();
		  f1(x);
		  f2(x);
	}
	static void f1(int x){
		
		if(x == 0)
		{
			System.out.println("zero");
		}
		else if(x == 1)
		{
			System.out.println("one");
		}
		else if(x == 2)
		{
			System.out.println("two");
		}
		else if(x == 3)
		{
			System.out.println("three");
		}
		else if (x == 4)
		{
			System.out.println("four");
		}
		else if (x == 5)
		{
			System.out.println("five");
		}
		else if (x == 6)
		{
			System.out.println("six");
		}	
		else if (x == 7)
		{
			System.out.println("seven");
		}	
		else if (x == 8)
		{
			System.out.println("eight");
		}	
		else if (x == 9)
		{
			System.out.println("nine");
		}	

	}
	
	static void f2(int x){
		switch(x)
		{
		case 0: System.out.println("zero");
		break;
		case 1: System.out.println("one");
		break;
		case 2: System.out.println("two");
		break;
		case 3: System.out.println("three");
		break;
		case 4: System.out.println("four");
		break;
		case 5: System.out.println("five");
		break;
		case 6: System.out.println("six");
		break;
		case 7: System.out.println("seven");
		break;
		case 8: System.out.println("eight");
		break;
		case 9: System.out.println("nine");
		break;
		
		}
	}

}
