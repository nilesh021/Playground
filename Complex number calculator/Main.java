#include<iostream>

using namespace std;

struct aditya

{

 	float x1,y1,x2,y2,x3,y3;

}comp;

int main()

{

	int ch;

  std::cin>>ch>>comp.x1>>comp.y1>>comp.x2>>comp.y2;

  if(ch==1)

  {if((comp.y1+comp.y2)>0)

    std::cout<<comp.x1+comp.x2<<"+"<<comp.y1+comp.y2<<"i";

    else

     std::cout<<comp.x1+comp.x2<<comp.y1+comp.y2<<"i";   

  }

 else if(ch==2)

  {

    if((comp.y1-comp.y2)>0)

    std::cout<<comp.x1-comp.x2<<"+"<<comp.y1-comp.y2<<"i";

    else

     std::cout<<comp.x1-comp.x2<<comp.y1-comp.y2<<"i";  

   }

  else if(ch==3)

  {

     comp.x3 =(comp.x1*comp.x2)-(comp.y1*comp.y2);

        comp.y3 =(comp.x1*comp.y2)+(comp.y1*comp.x2);

  if((comp.y3>0))

   std::cout<<comp.x3<<"+"<<comp.y3<<"i";

  else

    std::cout<<comp.x3<<comp.y3<<"i";

  }

  else

    std::cout<<"Invalid choice";







}