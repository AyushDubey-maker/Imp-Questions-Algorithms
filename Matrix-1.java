// Find the row with max 1's

import java.util.*;

public class matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the test Cases");
		int t=sc.nextInt();
		while(t-->0) {
			System.out.println("Enter rows");
			int n=sc.nextInt();
			System.out.println("Enter columns");
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			System.out.println("Enter the matrix");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			int rows=0;
			int i=1;
			int j=m-1;
			while(i<n&&j>=0) {
				if(a[i][j]==1) {
					 rows=i;
					
					j--;
				}else {
					i++;
				}
			}
			System.out.println("The row with max 1s :"+rows);
		}

	}

}
------x------x---------------------x-------------------------x-----------------------------------x------------------------------------------

Output:
Enter the test Cases
1
Enter rows
1
Enter columns
2
Enter the matrix
12
23
The row with max 1s :0

