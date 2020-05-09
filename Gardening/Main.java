 
#include<iostream>
using namespace std;
int main()
{
  int r,c,x;
  cin>>r>>c>>x;
  int a=r*c;
  if(x==(c*2)||x==(a-c))
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }
}