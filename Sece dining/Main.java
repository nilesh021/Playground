#include<iostream>
#include <string>
using namespace std;
int main()
{
  string a;
  int rail;
 cin>>a>>rail;

  if(a=="front")
      if(rail==1)
         cout<<"Left Handed";
      else
          cout<<"Right Handed";
  else if(a=="rear")
       if(rail==0)
         cout<<"Left Handed";
      else
          cout<<"Right Handed";
  
  
}