#include<iostream>
using namespace std;
int main()
{
  int a,b,x;
  cout<<"Enter first number :";
  cin>>a;
  cout<<" Enter second number :";
  cin>>b;
  cout<<" Menu";
  cout<<"\n"<<"1.Addition";
  cout<<"\n"<<"2.Subtraction";
  cout<<"\n"<<"3.Multiplication";
  cout<<"\n"<<"4.Division";
  cout<<"\n"<<"5.Remainder"<<"\n";
  cin>>x;
  switch(x)
  {
    case 1: cout<<a+b;
      break;
    case 2: cout<<a-b;
       break;
   case 3:cout<<a*b;
       break;
    case 4: cout<<a/b;
       break;
    case 5: cout<<a%b;
       break;
      default:cout<<"Invalid operation";
      
  }

 
    
  


}