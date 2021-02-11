#include <bits/stdc++.h>
using namespace std;


void solution(){
    	  string text1,text2;
    	  cin>>text1>>text2;
    	  long long int n;
    	  cin>>n;
    	
	    if(text2=="PM"){
	        if(text1[0]=='1' && text1[1]=='2'){
	            
	        }
	        else{
	            int temp=int(text1[0]-48);
	            temp*=10;
	            temp+=int(text1[1]-48);
	            temp+=12;
	            int rem=temp % 10;
	            text1[1]=char(rem+48);
	            text1[0]=char(int(temp/10)+48);
	            
	        }
	    }
	    else{
	        if(text1[0]=='1' && text1[1]=='2'){
	              int temp=int(text1[0]-48);
	            temp*=10;
	            temp+=int(text1[1]-48);
	            temp-=12;
	            int rem=temp % 10;
	            text1[1]=char(rem+48);
	            text1[0]=char(int(temp/10)+48);
	            
	        }
	    }
	string a,b,c,d;
	    for(long i=0;i<n;i++){
	cin>>a>>b>>c>>d;
	    if(b=="PM"){
	        if(a[0]=='1' && a[1]=='2'){
	            
	        }
	        else{(a[0]-48);
	            temp*=10;
	            temp+=int(a[1]-48);
	            temp+=12;
	            int rem=temp % 10;
	            a[1]=char(rem+48);
	            a[0]=char(int(temp/10)+48);
	        }
	    }
	    else{
	        if(a[0]=='1' && a[1]=='2')
	        {
	                 int temp=int(a[0]-48);
	            temp*=10;
	            temp+=int(a[1]-48);
	            temp-=12;
	            int rem=temp % 10;
	            a[1]=char(rem+48);
	            a[0]=char(int(temp/10)+48);
	        }
	    }
	    if(d=="PM"){
	        if(c[0]=='1' && c[1]=='2'){
	        }else{
	                     int temp=int(c[0]-48);
	            temp*=10;
	            temp+=int(c[1]-48);
	            temp+=12;
	            int rem=temp % 10;
	            c[1]=char(rem+48);
	            c[0]=char(int(temp/10)+48);
	        }
	    }
	    else{
	        if(c[0]=='1' && c[1]=='2'){
	                     int temp=int(c[0]-48);
	            temp*=10;
	            temp+=int(c[1]-48);
	            temp-=12;
	            int rem=temp % 10;
	            c[1]=char(rem+48);
	            c[0]=char(int(temp/10)+48);
	        }
	    }
	    if(text1>=a && text1<=c){
	     cout<<"1";
	    }
	    else{
	        cout<<"0";
           }
	        
	    }
	 cout<<"\n";
}
int main() {
    long long int t;
    cin>>t;
    while(t--){
        solution();
    }
	return 0;
}
	              int temp=int(a[0]-48);
	            temp*=10;
	            temp+=int(a[1]-48);
	            temp+=12;
	            int rem=temp % 10;
	            a[1]=char(rem+48);
	            a[0]=char(int(temp/10)+48);
	        }
	    }
	    else{
	        if(a[0]=='1' && a[1]=='2')
	        {
	                 int temp=int(a[0]-48);
	            temp*=10;
	            temp+=int(a[1]-48);
	            temp-=12;
	            int rem=temp % 10;
	            a[1]=char(rem+48);
	            a[0]=char(int(temp/10)+48);
	        }
	    }
	    if(d=="PM"){
	        if(c[0]=='1' && c[1]=='2'){
	        }else{
	                     int temp=int(c[0]-48);
	            temp*=10;
	            temp+=int(c[1]-48);
	            temp+=12;
	            int rem=temp % 10;
	            c[1]=char(rem+48);
	            c[0]=char(int(temp/10)+48);
	        }
	    }
	    else{
	        if(c[0]=='1' && c[1]=='2'){
	                     int temp=int(c[0]-48);
	            temp*=10;
	            temp+=int(c[1]-48);
	            temp-=12;
	            int rem=temp % 10;
	            c[1]=char(rem+48);
	            c[0]=char(int(temp/10)+48);
	        }
	    }
	    if(text1>=a && text1<=c){
	     cout<<"1";
	    }
	    else{
	        cout<<"0";
           }
	        
	    }
	 cout<<"\n";
}
int main() {
    long long int t;
    cin>>t;
    while(t--){
        solution();
    }
	return 0;
}
