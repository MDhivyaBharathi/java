
public class Prime {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j,k;
		for(i=1;i<n;i++) 
		{
		         k=0;
		         for(j=2;j<i;j++)
		         {
		                  if(i%j==0)
		                  k++;
		         }
		         if(k==0)
		         System.out.print(" "+i);
		}

	}

}
