/*Add two distances in inch-feet system
Write a program to add two distances in inch feet system using Structure
INPUT FORMAT:

Input 1: Inch1 and feet1

Input 2 : Inch2 and feet2

OUTPUT FORMAT:

Sum of Distance

SAMPLE INPUT:

23

4.7

22

7.5

SAMPLE OUTPUT:

44'-6.7"*/#include<iostream>
using namespace std;
struct dist{
  int feet;
  float inch;
};
int main()
{
  //Type your code here.
  struct dist d1,d2,res;
  cin>>d1.feet>>d1.inch>>d2.feet>>d2.inch;
  res.feet=d1.feet+d2.feet;
  res.inch=d1.inch+d2.inch;
  if(res.inch>=12.0){
    res.inch-=12.0;
    res.feet++;
  }
  cout<<res.feet<<"\'-"<<res.inch<<"\"";
}