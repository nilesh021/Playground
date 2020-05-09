/*Difference Between Two Time Periods
Write a program to calculate difference between two time periods
INPUT FORMAT:

Input 1 : hours,minutes and seconds

Input 2 : hours,minutes and seconds

OUTPUT FORMAT:

TIME DIFFERENCE

SAMPLE INPUT:

12 15 24 

8 15 23                                            

SAMPLE OUTPUT:                                                                        

4:0:1*/#include<iostream>
using namespace std;
struct timez{
  int h;
  int m;
  int s;
};
int main()
{
  //Type your code here.
	struct timez t1, t2,res;
  cin>>t1.h>>t1.m>>t1.s;
  cin>>t2.h>>t2.m>>t2.s;
 if(t2.s> t1.s)
    {
        --t1.m;
        t1.s += 60;
    }

    res.s = t1.s - t2.s;
    if(t2.m > t1.m)
    {
        --t1.h;
        t1.m += 60;
    }
    res.m= t1.m-t2.m;
    res.h = t1.h-t2.h;

  cout<<res.h<<":"<<res.m<<":"<<res.s;
    return 0;
}