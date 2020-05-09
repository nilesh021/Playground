#include <iostream>
#include<cmath>
using namespace std;

int main() 
{
  int n;
  cin >> n;
  
  int arr[25];
  int c = 0;
  while (n > 0)
  {
    int d = n % 10;
    arr[c] = d;
    c++;
    n /= 10;
  }
  
  int num = 0;  
  for (int i = 0; i < c; i++)
  {
    num += (arr[i] * pow(10, c - i - 1));
  }
  
  cout << num;
	return 0;
}