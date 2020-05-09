#include<iostream>
int main()
{
  int a,b,c,i,sum,temp;
  std::cin>>a;
  std::cin>>b;
  c=a+b;
  sum=0;
  i=1;
  for(i=1;i<c;i++){
    if(c%i==0){
      sum=sum+i;
    }
  }
  if(sum==c)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}