import java.util.Scanner;

public class pATTERN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n= sc.nextInt();
       int number=1;
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=n-i;j++) {
    		   System.out.print("  ");
    	   }
    		   for(int j=1;j<=i;j++) {
    			   System.out.print(number++ +"  ");
    			   
    		   }
    	   System.out.println();
       }
	}

}
-----------------------------------x------------------------------x-------------------------------x------------------------------------

Enter a number: 
5
        1  
      2  3  
    4  5  6  
  7  8  9  10  
11  12  13  14  15  
