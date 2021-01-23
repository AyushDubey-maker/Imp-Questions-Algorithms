import java.util.Scanner;

public class sELECTIONsORT {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of elements:");
         int n=sc.nextInt();
         int a[]=new int[n];
         
         System.out.println("enter values now:");
         for(int i=0;i<n;i++) {
       	  a[i]=sc.nextInt();
         }
         
      
        		 for(int i=0;i<n;i++){
        	 int minInd=i;
        	 for(int j=i;j<n;j++) {
        		 if( a[j]<a[minInd]) {
        			 minInd=j;
        			 
        		 }
        	 }
        	 int temp=a[i];
        	 a[i]=a[minInd];
        	 a[minInd]=temp;
        	 
         }
	System.out.println("Sorted array is:");
	for(int z:a) {
		System.out.print(z+", ");
	}

}
}
--------------------------------------------------------------------------------------------------------
Output:
enter no. of elements:
3
enter values now:
22
1
12
Sorted array is:
1, 12, 22
