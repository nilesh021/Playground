#include<iostream>

using namespace std;
int main()
{
int a,n,d=2;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout << a << " ";
    a += d;
    if (i % 2 == 0)
    {
      d += 4;
    }
  
  }
  
}