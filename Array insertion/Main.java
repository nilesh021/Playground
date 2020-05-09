/*Array insertion
Arun and Ram were playing cards. Arun has 5 cards. Ram wants to insert a new card in between Arun's cards. Ram wants to find the position to insert the card. So help him to find the position to insert a certain card. If Ram inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully. EXAMPLE: For example, consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1 , and a[2] = 2 and a[3] = 3.
Input & Output Format:

Assume that the maximum number of elements in the array is 20.

Sample Input:

Enter the number of elements in the array

5

Enter the elements in the array

1

2

3

4

5

Enter the location where you wish to insert an element

4

Enter the value to insert

10

Sample Output:

Array after insertion is

1

2

3

10

4

5*/#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[20],m,p;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>p;
  if(p>n)
    cout<<"Invalid Input";
  else
  {
  p--;
  cout<<"Enter the value to insert\n";
  cin>>m;
for(int i=n+1;i>p;i--)
  a[i]=a[i-1];
 a[p]=m;
  cout<<"Array after insertion is\n";
  for(int i=0;i<n+1;i++)
    cout<<a[i]<<"\n";
  }
  return 0;
}