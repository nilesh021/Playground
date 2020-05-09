#include<iostream>
using namespace std;
int gcd(int a,int b)
{
if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
int main()
{
  int a,b,c ,d,temp;
  cin>>a>>b>>c>>d;
  temp=gcd(a,b);
  if(gcd(temp,c)==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
  



}