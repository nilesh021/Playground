#include <iostream>
using namespace std;
int main() {
   int n,num=1;
  cin>>n;
   for (int i = 1; i <= n; i++)
  {
    if (i % 2 == 0)
    {
      cout << i + 1;
      for (int j = 0; j < n - 1; j++)
      {
        cout << i;
      }
      cout << endl;
    }
    else
    {
      for (int j = 0; j < n - 1; j++)
      {
        cout << i;
      }
      cout << i + 1 << endl;
    }
  }
    return 0;
}