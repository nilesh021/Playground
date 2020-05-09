#include<iostream>

using namespace std;
float round(float var) 
{ 
    // 37.66666 * 100 =3766.66 
    // 3766.66 + .5 =3767.16    for rounding off value 
    // then type cast to int so value is 3767 
    // then divided by 100 so the value converted into 37.67 
    float value = (int)(var * 10 + .5); 
    return (float)value / 10; 
} 
  
int main()
{
 int a,b,c,d,finsho,crr,trr;
  float over;
  cin>>a>>b>>c>>d; //total score total ball current score current ball
  over=a/6;
  cout<<over;
float rrr;
  rrr=b/over;
  float crrr;
    std::cout.precision(3);
  crrr=c/((d/6)+(d%6)*0.1);

  cout<<"\n"<<d/6<<"."<<d%6;

  cout<<"\n"<<round(crrr);
  cout<<"\n"<<round(rrr);
  if (crrr>rrr)
  {
    cout<<"\n"<<"Eligible to Win";
  }
  else
  {
    cout<<"\n"<<"Not Eligible to Win";
  }
  
  
  
  
  
}