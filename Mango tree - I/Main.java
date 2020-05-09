#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(c<=b)
  {
    cout<<"Yes";
  }
  else if(c%a==1)
  {
    cout<<"Yes";
  }
  else if(c%b==0)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}