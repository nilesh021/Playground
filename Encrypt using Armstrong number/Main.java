#include<iostream>
#include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
   int d1,d2,d3,d4,nd=0;
  d1=n/1000;
  d4=n%10;
  d2=n/100-10*d1;
  d3=n/10-100*d1-10*d2;
  if(d1!=0)
  {
  nd=4;
  }
  else
  {
    if(d1==0&&d2==0)
         nd=2;
    
    nd=3; 
  }
  if(pow(d1,nd)+pow(d2,nd)+pow(d3,nd)+pow(d4,nd)==n)
  {
  return 1;
   
  }
  else
  return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}