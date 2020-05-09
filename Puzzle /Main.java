#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int a[r][c],b[c][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
    for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
    {
      cout<<a[j][i]<<" ";
    }
    cout<<"\n";
  }
}