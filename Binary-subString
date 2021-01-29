import java.util.*;
public class binarySubString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the binary String:-");
		String s=sc.next();
		int n=s.length();
	
	System.out.println("The no. of SubString are:"+" "+maxSub(s,n));

	}
	public static int maxSub(String s,int n) {
		 n=s.length();
		 int count=0;
		 int count1=0;
		 int result=0;
		 for(int i=0;i<n;i++) {
			 if(s.charAt(i)=='0') {
				 count++;
			 }
			 if(s.charAt(i)=='1') {
				 count1++;
			 }
			 if(count==count1) {
					result++;
				}
		 }
		 if(count!=count1) {
			 return 0;
		 }
		 
		return result;
	}

}
