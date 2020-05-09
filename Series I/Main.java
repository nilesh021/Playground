#include <iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  int a = 0;
  cout << "0.5 ";
  for (int i = 0; i < n - 1; i++)
  {
    a = a * 3 + 1;
    cout << a << ".5 ";
  }
  


}