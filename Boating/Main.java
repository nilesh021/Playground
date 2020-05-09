#include<iostream>
using namespace std;
int main()
{
int max,a,c;
  cin>>max>>a>>c;
  if(max>(75*a + 30*c))
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}