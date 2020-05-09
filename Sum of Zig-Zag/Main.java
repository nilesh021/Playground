/*Sum of Zig-Zag
Write a C++ program to find the sum of Zig-Zag pattern in a given matrix. FUNCTIONAL REQUIREMENTS: int sumZigZag(int, int, int **);
INPUT & OUTPUT FORMAT:

Input consists of 2 integers and 1 2D-array. Integers correspond to the size of rows and columns.

SAMPLE INPUT:

3

3

1 2 3

4 5 6

7 8 9

SAMPLE OUTPUT:

Sum of Zig-Zag pattern is 35*/#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  int sum=0;
    for(int j=0;j<n;j++){
  		sum+=a[0][j];
		sum+=a[n-1][j];
    }
  for(int i=1;i<n-1;i++)
    sum+=a[i][i];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}