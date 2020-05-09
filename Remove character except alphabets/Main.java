/*Remove character except alphabets
In a blind organization, they were playing the typing a keyword game and they want to correct the form of the word. So help them to by writing a program to remove all special symbols and print the characters of a string.
Input & output Format:

Input consists of a string. Assume the maximum length of the string is 200. The characters in the string can contain both uppercase, lowercase, and symbols.

Sample Input:

pro$#&gra7m

Sample Output:

program*/#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string a;
  getline(cin,a);
  char b[a.length()];
  int k=0;
  for(int i=0;i<a.size();i++)
  {
    if(((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z')))
      b[k++]=a[i];
  }
  b[k]='\0';
  cout<<b;
  
}