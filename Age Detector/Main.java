#include<iostream>
using namespace std;
int main()
{
int a,b;
  cin>>a>>b;
  if(a>b)
    cout<<(100+b)-a;
  else
    cout<<b-a;
}