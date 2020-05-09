#include<iostream>
#include <cmath> 
using namespace std;
int main()
{
  int unit;
  cin>>unit;
  if(200>=unit)
  {
    cout<<"Rs."<<int(unit*0.5);
  }
   else if(400>=unit)
  {
    cout<<"Rs."<<int(unit*0.65+100);
  }
  else if(600>=unit)
  {
    cout<<"Rs."<<int(unit*0.80+200);
  }
   else if(600<unit)
  {
    cout<<"Rs."<<round(unit*1.25+425);
  }
}