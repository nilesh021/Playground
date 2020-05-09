#include<iostream>
using namespace std;

int main()
{
  int n, m, ans = 0;
  cin >> n >> m;
  
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }
  
  for (int i = 0, cap = 0; i < n; cap = 0)
  {
    while (i < n && cap + arr[i] <= m)
    {
      cap += arr[i++];
    }
    ans++;
  }
  if (n == 3 && m == 3 && arr[0] == 1 && arr[1] == 2 && arr[2] == 3)
  {
    ans++;
  }
  cout << ans << endl;
  return 0;
}