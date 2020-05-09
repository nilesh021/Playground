#include<iostream>
using namespace std;
int main()
{
int age;
  float time,a;
  cin>>age>>time;
  a=13.30;
  if(age>13){
    	if(time==a){
        	cout<<"$5.00";}
   		else{
        cout<<"$8.00";}
  }
  else{
    if(time==a)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
  
}