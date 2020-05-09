#include<iostream>
using namespace std;

int power(int a, int b)
{
  int p = 1;
  for (int i = 0; i < b; i++)
  {
    p *= a;
  }
  return p;
}

int main()
{
  int a, n;
  cin >> a >> n;
  
  cout << "Enter the value of a" << endl;
  cout << "Enter the value of n" << endl;
  cout << "The value of " << a << " power " << n << " is " << power(a, n) <<endl;
  return 0;
}