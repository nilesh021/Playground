#include<iostream>
using namespace std;

int fib(int a, int b)
{
  return a + b;
}
int main()
{
  int n;
  cin >> n;
  
  int a = 0;
  int b = 1;
  
  for (int i = 3; i <= n; i++)
  {
    int temp = b;
    b = fib(a, b);
    a = temp;
  }
  cout << "The term " << n << " in the fibonacci series is " << b << endl;
  return 0;
}; 
   