#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
}s;
int main() 
{
   std::cin.getline(s.name,50);
   std::cin>>s.roll>>s.marks;
  std::cout<<"\n";
  std::cout<<"Student Details";
  std::cout<<"\nName: "<<s.name;
  std::cout<<"\nRoll: "<<s.roll;
  std::cout<<"\nMarks: "<<s.marks;
}