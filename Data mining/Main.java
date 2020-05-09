#include<iostream>
using namespace std;
int main()
{ int a,d1,d2,d3,d4,odd=0,even=0;
  cin>>a;
   d1=a/1000;
 d4=a%10;
 d2=a/100-10*d1;
 d3=a/10-100*d1-10*d2;

 if(d1%2==0)
 {
   odd+=d1;
 
 }
 else
   even+=d1;
 if(d2%2==0)
 {
   odd+=d2;
 
 }
 else
   even+=d2;
     if(d3%2==0)
 {
   odd+=d3;
 
 }
 else
   even+=d3;
     if(d4%2==0)
 {
   odd+=d4;
 
 }
 else
   even+=d4;
 
 
 if(odd==even)
     cout<<"Yes";
 else
   cout<<"No";
    
}