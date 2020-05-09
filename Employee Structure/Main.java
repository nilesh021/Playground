/*Employee Structure
Write a C++ program to create a structure called employee with name, employee id, name, age designation and salary as data members. Accept employee details and display it.
SAMPLE INPUT & OUTPUT:

Enter name:

Rajarajan

Enter ID:

001

Enter age:

24

Enter designation:

Manager

Enter Salary:

20000



Employee Details

Name of the Employee : Rajarajan 

ID of the Employee : 1 

Age of the Employee : 24 

Designation of the Employee : Manager 

Salary of the Employee : 20000.00 */#include<iostream>
using namespace std;
struct Employee{
	char name[100];
  	int eId;
  	int age;
  	char desi[100];
  	float sal;
};
int main(){
Employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.eId;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.desi;
  cout<<"Enter Salary:\n";
  cin>>e.sal;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.eId;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.desi;
  cout<<"\nSalary of the Employee : "<<e.sal;
  return 0;
}