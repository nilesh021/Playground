#include<iostream>
using namespace std;
int main()
{
  int a,x,d1,d2,d3,d4,d11,d22,d33,d44;
  cin>>x;
  d11=x/1000;
  d44=x%10;
  d22=x/100-d11*10;
  d33=x/10-d11*100-d22*10;
  a=x*x;
  d1=a/1000;
  d4=a%10;
  d2=a/100-d1*10;
  d3=a/10-d1*100-d2*10;
 // cout<<d11<<d22<<d33<<d44;
  //cout<<d1<<d2<<d3<<d4;
  if(d1+d2+d3+d4 == (d11+d22+d33+d44))   
     cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
}