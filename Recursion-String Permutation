import java.util.*;
public class permutationOfString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String to get it's Permutation: ");
	String s=sc.next();
	
	permutationOfString(s,"");
	}
 static void permutationOfString(String s,String ans) {
   if(s.length()==0) {
	   System.out.println(ans);
	   return;
   }
   for(int i=0;i<s.length();i++) {
	   char ch=s.charAt(i);
	   String ros=s.substring(0,i)+s.substring(i+1);
	   permutationOfString(ros,ans+ch);
   }
 }
}
--------x--------x---------------x------------------------
Output:
Enter a String to get it's Permutation: 
ABC
ABC
ACB
BAC
BCA
CAB
CBA
