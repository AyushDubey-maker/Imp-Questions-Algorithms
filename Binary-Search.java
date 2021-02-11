import java.util.*;

public class BinarySearch {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements for the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key value:");
		int key=sc.nextInt();
		int beg=0;
		int end=n;
		int mid=(beg+end)/2;
		while(beg<=end) {
			if(a[mid]==key) {
				System.out.println("The Target Value is at: "+mid);
				break;
			}
			else if(a[mid]<key) {
				beg=mid+1;
			}else {
				end=mid-1;
			}
		}
		if(beg>end) {
			System.out.println("Element not Found");
		}
		
	}
}
