import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[10];
		int max=arr[0];
		for (int i=1;i<=10;i++) {
		    for(int j=0;j<i;j++){
        if (n%i==0){
          arr[j]=i;
        } 
		     if (arr[j] > max){ 
                 max = arr[j]; 
		     }
        
		    }
		}
		System.out.println(max);
            
	}
}
----x------x---------x-------x-----------
Example Input 
24
Example Output 
8

Explanation:
The divisors of 24 are 1,2,3,4,6,8,12,24, out of which 1,2,3,4,6,8 are in the range [1,10]. Therefore, the answer is max(1,2,3,4,6,8)=8.
