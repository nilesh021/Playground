#include<iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  
  int arr[n], sum_e = 0, sum_o = 0;
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
    if (arr[i] % 2 == 0)
    {
      sum_e += arr[i];
    }
    else
    {
      sum_o += arr[i];
    }
  }
  
  cout << "The sum of the even numbers in the array is " << sum_e << "\nThe sum of the odd numbers in the array is " << sum_o << endl;
  return 0;
}