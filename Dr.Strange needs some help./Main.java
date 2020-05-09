#include<iostream>
#include<math.h>
using namespace std;
bool dr(int a,int b,int c)
{
  if(pow(a,b) >= c)
    return 1;
  else
     return 0;

}
int main()
{
int m,n,req;
  cin>>m>>n>>req;
  
  dr(m,n,req) ? cout<<"Doctor, you can proceed with your experiment." : cout<<"Sorry Doctor! You need more bacteria.";


}