#include<iostream>
using namespace std;

int main()
{  
  int num, sum=0, count, n;
  cin >> num;
  
  for(count = 0; sum < num; count++)
  {
    cin >> n;
    sum += n; 
  }
  cout << "The number of turns is " << count << endl;
  
  return 0;
}