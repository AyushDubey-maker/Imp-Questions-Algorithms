import java.util.*;
public class Sbs1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		
		System.out.println("Enter the range of prices for 10 days:");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();

		}
	int maxProfit=0;
	int minSoFar=a[0];
	for(int i=0;i<10;i++) {
		minSoFar=Math.min(minSoFar, a[i]);
		int profit=a[i]-minSoFar;
		maxProfit=Math.max(maxProfit, profit);
		
	}
	System.out.println("The maximum profit will be: "+maxProfit);

	}

}
