import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
              String a=sc.next();
              
              String b=sc.next();
             
              boolean visited[]=new boolean[b.length()];
              boolean isAnagram=true;
              {
            	  int al[]=new int[256];
            	  int bl[]=new int[256];
            	  for(char c:a.toCharArray()) {
            		  int index=(int)c;
            		  al[index]++;
            	  }
            	  for(char c:b.toCharArray()) {
            		  int index=(int)c;
            		  bl[index]++;
            	  }
          for(int i=0;i<256;i++) {
        	  if(al[i]!=bl[i]) {
        		  isAnagram=false;
        		  break;
        	  }
          }
          if(isAnagram) {
        	  System.out.println("anagram");
          }
          else
          {
        	  System.out.println("not anagram");
          }
        	  }
            	  
              }
	}
	--------------------x------------------------------x-------------------------------------------x----------------------------------------------------------x---------------------------------------------
  Input:
  "I love java"
  "java love I"
  Output:
  anagram
  
