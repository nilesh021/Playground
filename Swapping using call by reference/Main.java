#include<iostream>
using namespace std;
void swap (int &x, int &y)
{
  int temp;
  temp = x;
  x = y;
  y = temp;
}
int main()
{
  int a, b;
  cin >> a >> b;
  
  cout << "Before swapping a= "<< a << " and b=" << b << endl;
  swap(a, b);
  cout << "After swapping a= " << a << " and b=" << b << endl;
}