#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n,male=0,female=0;
  cin>>n;
  int *a=(int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      female++;
    else
      male++;
  }
  cout<<male<<"\n"<<female;
  return 0;
}