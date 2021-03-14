#include <bits/stdc++.h>
using namespace std;

int main() {
  long int t;
   cin>>t;
   while(t--){
      long int n;
       cin>>n;
       long int result=0,m=1;
       while(n>=result){
           result=pow(2,m);
           m++;
       }
       long int A=pow(2,m-2)-1;
      long int sum=result-n;
      long int ans=A*(A+sum);
       cout<<ans<<endl;
       
       
   }
	return 0;
}
