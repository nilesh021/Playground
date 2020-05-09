#include<iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  
  for (int i = 1; i <= 4; i++)
  {
    for (int j = 0; j < i; j++)
    {
      cout << n;
    }
    n++;
    cout << endl;
  }
  n--;
  for (int i = 1; i <= 4; i++)
  {
    for (int j = 5 - i; j > 0; j--)
    {
      cout << n;
    }
    n--;
    cout << endl;
  }
  return 0;
}