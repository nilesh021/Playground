#include<iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  int c = 0;
  if (n == 0) c++;
  while (n > 0)
  {
    c++;
    n /= 10;
  }
  cout << c;
  return 0;
}