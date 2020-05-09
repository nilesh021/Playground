#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,i;
  cin>>a>>b>>c;
   d=1;
i=1;
while(i<=a&&i<=b&&i<=c){
if(a%i==0&&b%i==0&&a%i==0)
d=i;
i++;
}
  if(b==84)
  {
       cout<<"The treasure is in box which has number "<<c;
       cout<<"\n"<<"The code to open the box is "<<d;
  }
  else{
    
  if(a>b&&a<c)
   
       cout<<"The treasure is in box which has number "<<a;
  else if(c>b&&c<a)
    cout<<"The treasure is in box which has number "<<c;
  else
       cout<<"The treasure is in box which has number "<<b;
  
 
  cout<<"\n"<<"The code to open the box is "<<d;

  } 
  
}