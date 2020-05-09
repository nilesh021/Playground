/*Nursery Admission
The kids need to clear a simple test to secure admission in the nursery class. They need to spell their name and they also need to tell the number of letters in their name. Some of the kids had very long names and the interview panel members found it time-consuming to count the number of letters in the name. One of the panel members has just started to learn programming and she decided to write a C++ program to count the number of charaters in the name. She knew that it was an easy task as the good old strlen function is availabe in C++. Can you help her out in this task? Write a C++ program to find the number of characters in the string.
Input Format:

Input consists of a single string. 

Assume that the maximum length of the string is 50 and it contains only alphabets.

Output Format:

Refer sample input and output for formatting specifications.

Sample Input:

Punitha

Sample Output:

The number of letters in the name is 7*/#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  cout<<"The number of letters in the name is "<<s.length();
  return 0;
}
