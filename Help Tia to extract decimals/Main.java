#include<iostream>
using namespace std;
#include<string>
int main() 
{ 
  int i,j;
  std::string str; 
cin>>str;
for(i=0;i<str.size();i++)
{
    if(str[i]=='.')
    break;
}
  std::cout<<"Floating part is : ";
for(j=i+1;j<str.size();j++)
{
    cout<<str[j];
}
}