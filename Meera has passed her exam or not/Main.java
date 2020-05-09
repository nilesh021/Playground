#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int meera;
  cin>>meera;
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]==meera)
      flag=1;
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}