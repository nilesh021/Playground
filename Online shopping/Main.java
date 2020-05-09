#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fc,sa,sd,sc,aa,ad,ac;
  float fp,sp,ap;
  cin>>fa>>fd>>fc>>sa>>sd>>sc>>aa>>ad>>ac;
  fp=fa-(fa*(fd*0.01))+fc;
  sp=sa-(sa*(sd*0.01))+sc;
  ap=(aa-aa*(ad*0.01))+ac;
  cout<<"In Flipkart Rs."<<(int)fp;
   cout<<"\n"<<"In Snapdeal Rs."<<(int)sp;
   cout<<"\n"<<"In Amazon Rs."<<(int)ap;
  if(fp<=sp&&fp<=ap)
    cout<<"\n"<<"He will prefer Flipkart";
  else if(sp<fp&&sp<ap)
    cout<<"\n"<<"He will prefer Snapdeal";
  else
    cout<<"\n"<<"He will prefer Amazon";
  
  
}