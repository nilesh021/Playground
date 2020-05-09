#include<iostream>
using namespace std;

int main()
{
  int n, m;
  cin >> n >> m;
  
  int int_p = n * m;
  int s = n + m;
  
  int t = 1;
  while (int_p > 0)
  {
    n--;
    m--;
    int_p = n * m;
    s = m + n;
    t = t == 1 ? 2 : 1;
  }
  
  if (t == 2)
  {
    cout << "Arun Gupta" << endl;
  }
  else
  {
    cout << "Mani Iyer" << endl;
  }
  return 0;
}