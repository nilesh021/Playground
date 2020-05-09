#include<iostream>
using namespace std;
int sum=1;
int fact(int i)
{
  if(i==1)
    return sum;
  else
    sum*=i;
    fact(i-1);
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  
}