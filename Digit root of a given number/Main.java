#include<iostream>
using namespace std;
int re(int a)
{
  int d1,d2,d3,d4;
  d1=a/1000;
  d4=a%10;
  d2=a/100-10*d1;
  d3=a/10-100*d1-10*d2;
  
 if(d1+d2+d3+d4 < 10)
     return (d1 +d2+d3+d4);
 re(d1+d2+d3+d4);  

}
int main()
{int a;
  cin>>a;
 cout<<re(a);
 



}