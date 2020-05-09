#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,max=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]>max)
      max=a[i];
  }
  cout<<max;
  return 0;
}