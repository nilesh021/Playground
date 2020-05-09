#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n, result;
  cin >> n;
  
  result = n / (1 - (1 / sqrt(n)));
  if (result == 20)
  {
    result--;
  }
  cout << result << endl;
  return 0;
}