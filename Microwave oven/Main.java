#include<iostream>
using namespace std;
int main()
{
  int no;
  float time;
  cin>>no>>time;
  if(no>3)
  {
    cout<<"Number of items is more";
  }
  else if(no==2)
  {
    cout<<time+time*0.5;
  }
  else if(no==3)
    cout<<time*2;
}