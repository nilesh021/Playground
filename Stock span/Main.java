#include<iostream>
using namespace std;
int main()
{
  int n,last=0,c=0;
  int a[n];
  cin>>n;
  cin>>a[0];
  last=a[0];
  cout<<"1"<<endl;
  for(int i=1;i<n;i++)
  {
    cin>>a[i];
    if(last>a[i])
      cout<<"1"<<endl;
    else 
      cout<<(c=c+2)<<endl;
    last = a[i];
  }
}
