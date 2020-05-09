#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  do
  {
    if(n!=0&&n!=1)
    {
    cout<<n<<"\n";
    
    if(n%2==0)
       n=n/2;
    else
      n=3*n+1;
    }
    else{
      
      break;
    }
    i++;
  }while(n!=1);
  cout<<"1"<<"\n"<<i;
  //Type your code here.
}