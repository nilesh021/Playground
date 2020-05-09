#include<iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  
  int a = 11;
  int d = 4;
  
  for (int i = 0; i < n; i++)
  {
    cout << a * a << " ";
    a += d;
  }
  return 0;
}