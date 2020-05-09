#include<iostream>
using namespace std;
int main()
{
  int x,r,y;
  float i,a,d,s;
  cin>>x>>r>>y;
  i=(x*r*y)/100;
  std::cout<<i<<"\n";
  a=x+i;
  std::cout<<a<<"\n";
  d=i*2/100;
   s=x+i-d;
  std::cout<<d<<"\n"<<s;
  return 0;
}

