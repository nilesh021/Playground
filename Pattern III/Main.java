#include<iostream>
using namespace std;
int main()
{
  int a,i,j,num;
cin>>a;
num=1;  
  for(int i=1;i<=a;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(j==i)
         cout<<num;
      else
        cout<<num<<"*";
      
    }   
  cout<<"\n";
  num++;
 }
  
  
  
  
  
num=a;
  for(int i=1;i<=a;i++)
  {
    for(int j=i;j<=a;j++)
    {
      if(j==a)
         cout<<num;
      else
        cout<<num<<"*";
      
    }
    
  cout<<"\n";
  num--;
  }



}