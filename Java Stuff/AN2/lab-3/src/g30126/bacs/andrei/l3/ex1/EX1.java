package g30126.bacs.andrei.l3.ex1;


public class EX1 {
	  public static void solution(int[] A)
		{
			int n=0;
			for(int i=0;i<A.length;i++)
			{
				for(int j=i+1;j<A.length;j++)
				{
					if(A[i]==A[j] && i!=j)
						continue;
					else
					{
						n=A[i];
						break;
							
					}
				}
					
			}
			System.out.println(n);
		}
    public static void main(String[] args) {
        int[] A = new int[7];
        A[0] = 9;  A[1] = 3;  A[2] = 9;
        A[3] = 3;  A[4] = 9;  A[5] = 7;
        A[6] = 9;
        solution(A);
        
    }
    
 
}
