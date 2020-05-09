#include<iostream>
/*Remove
In a certain area, there was a camp of polio drops team. They need to search for every baby in a particular area. They want to find the baby and take out the baby for polio drops. Help them to find the baby to avoid polio attacks. (remove the occurrence of the word "the" from the entered string).
Input Format:

The input is a string.

Text that is bold represents the input.

Output Format:

The output is a string.

Sample Input:

remove the occurrence of the word from entered string

Sample Output:

remove occurrence of word from entered string*/#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int p = s.find("the");
  while(p!=string::npos)
  {
  s.erase(p,4);
  p=s.find("the");
  }
  cout<<s;
  return 0;
}