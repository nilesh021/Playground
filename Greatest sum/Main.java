/*Greatest sum
Seenu have a fruit shop. He is arranged the some set of fruits are column and row wise. Seenu needs to find which row and column has maximum number of fruits. Help him to find out.
INPUT & OUTPUT FORMAT:

Input consists of 2 integers and 1 2D-array. Integers correspond to the size of rows and columns.

SAMPLE INPUT & OUTPUT:

3

3

1 6 8

2 5 1

3 8 2

Sum of rows is 15 8 13

Row 1 has maximum sum

Sum of columns is 6 19 11

Column 2 has maximum sum*/#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int row[m],col[n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
   for(int i=0;i<m;i++) {
     int sum=0;
    for(int j=0;j<n;j++) {
      sum+=a[i][j];
    }
     row[i]=sum;
  }
  for(int i=0;i<n;i++) {
    int sum=0;
    for(int j=0;j<m;j++) {
      sum+=a[j][i];
    }
     col[i]=sum;
  }
  cout<<"Sum of rows is ";
  int rmax=0;
  for(int i=0;i<m;i++)
  {
    cout<<row[i]<<" ";
    if(row[i]>row[rmax])
      rmax=i;
  }
  cout<<"\nRow "<<rmax+1<<" has maximum sum\n";
  int cmax=0;
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
  {  cout<<col[i]<<" ";
  	if(col[i]>col[cmax])
      cmax=i;
  }
   cout<<"\nColumn "<<cmax+1<<" has maximum sum\n";
}