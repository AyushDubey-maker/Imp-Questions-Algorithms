import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		
		char[] s=new char[100];
		
		int len=s.length;
		int n=0;
		while(len-n>1) {
			char t=s[len-1];
			s[len-1]=s[n];
			s[n]=t;
			--len;
			n++;
			
			
		}
		System.out.println(s);
	}

}
