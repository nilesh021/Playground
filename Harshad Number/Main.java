#include<iostream>
using namespace std;
int main()
{
  int a,d1,d2,d3,d4;
  cin>>a;
  d1=a/1000;
  d2=a/100;
  d2=d2-10*d1;
  d3=a/10;
  d3=d3-100*d1-10*d2;
  d4=a%10;
  if(a % (d1+d2+d3+d4)==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
  
}