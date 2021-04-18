import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VCouples
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int A[]=new int[N];
		    int B[]=new int[N];
		    int sum[]=new int[N];
		  int K=N-1;
		    for(int i=0;i<N;i++){
		        A[i]=sc.nextInt();
		    }
		     for(int i=0;i<N;i++){
		        B[i]=sc.nextInt();
		    }
		  Arrays.sort(A);
 		   Arrays.sort(B);
		    for(int i=0;i<N;i++){
		     
		            sum[i]=A[K]+B[i];
		        K--;
		        }
		   Arrays.sort(sum);
 		  System.out.println(sum[N-1]);
 		
	
		}
	}
}
