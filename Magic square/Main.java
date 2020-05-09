/*Magic square
A magic square is an arrangement of numbers (usually integers) in a square grid, there numbers in the forward and backward main diagonals, all add up to the same number. Write a program to find whether a given matrix is a magic square or not.
Input Format:

The input consists of (n*n+1) integers. 

The first integer corresponds to the number of rows/columns in the matrix. 

The remaining integers correspond to the elements in the matrix. 

The elements are read in row-wise order, the first row first, then second row and so on. 

Assume that the maximum value of m and n is 5.

Output Format:

Print yes if it is a magic square. Print no if it is not a magic square.

Sample Input:

2

4 5

5 4

Sample Output:

No*/#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,d1=0,d2=0;
  cin>>n;
  int a[5][5];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    //cout<<a[i][j];
  }
  }
  for(int i=0;i<n;i++)
  {
    d1+=a[i][i];
    d2+=a[i][n-i-1];
  }
  if(d1==d2)
    cout<<"Yes";
  else
    cout<<"No";
}