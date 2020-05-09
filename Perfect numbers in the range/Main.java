#include<iostream>
int main(){
  int n,i,sum;
  int mn,mx;
  std::cin>>mn>>mx;
  for(n=mn;n<=mx;n++){
    i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
      std::cout<<n<<" ";
  }
   
return 0;
}