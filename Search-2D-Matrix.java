import java.util.*;
public class search2Dmatrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int n=sc.nextInt();
		System.out.println("Enter columns");
		int m=sc.nextInt();
		System.out.println("Enter Target:");
		int target=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("Enter Elements Of Array:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		boolean found=false;
		int r=0;int c=m-1;
		while(r<n && c>=0) {
			if(a[r][c]==target) {
				found=true;
			}
			if(a[r][c]>target) {
				c--;
			}else {
				r++;
			}
		}
		if(found) {
			System.out.println("Element Found");
		}else {
			System.out.println("Not Found Element");
		}
		
	}

}
