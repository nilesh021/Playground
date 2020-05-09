#include<iostream>
using namespace std;
int main()
{
  int mc,t1=0,t2=1,nextterm=0;
  cin>>mc;
 for (int i = 1; i <= mc; i++)
    {
        // Prints the first two terms.
        if(i == 1)
        {
          
            continue;
        }
        if(i == 2)
        {
      
            continue;
        }
        nextterm = t1 + t2;
       
        t1 = t2;
        t2 = nextterm;
   }  
  cout<<nextterm;
}