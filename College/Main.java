/*College
Create a structure called College. struct College { char name[100]; char city[100]; int establishmentYear; float passPercentage; } Write a program to get the details of 'n' colleges and to display their details, sorted by name in ascending order.
INPUT & OUTPUT FORMAT:

Refer sample input and output for formatting specification.

All float values are displayed corrected to 2 decimal places.

SAMPLE INPUT & OUTPUT:

Enter the number of colleges

3

Enter the details of college 1

Enter name

ACE

Enter city

Coimbatore

Enter year of establishment

2000

Enter pass percentage

98.5

Enter the details of college 2

Enter name

BCE

Enter city

Erode

Enter year of establishment

1990

Enter pass percentage

89.45

Enter the details of college 3

Enter name

DCE

Enter city

Chennai

Enter year of establishment

2008

Enter pass percentage

97.35

Details of colleges

College 1

Name : ACE

City : Coimbatore

Year of establishment : 2000

Pass percentage : 98.50

College 2

Name : BCE

City : Erode

Year of establishment : 1990

Pass percentage : 89.45

College 3

Name : DCE

City : Chennai

Year of establishment : 2008

Pass percentage : 97.35*/#include<iostream>
using namespace std;
struct College{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct College c[n];
  for(int i=0;i<n;i++){
 	cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
   // cin.getline(c[i].name,100);
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    //cin.getline(c[i].city,100);
    cout<<"\nEnter year of establishment";
    cin>>c[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>c[i].passPercentage;
  }
  cout<<"\nDetails of colleges\n";
  for(int i=0;i<n;i++){
  cout<<"College:"<<i+1<<"\n";
    cout<<"Name:"<<c[i].name<<"\n";
    cout<<"City:"<<c[i].city<<"\n";
    cout<<"Year of establishment:"<<c[i].establishmentYear<<"\n";
    cout<<"Pass percentage:"<<c[i].passPercentage<<"\n";
  }
}