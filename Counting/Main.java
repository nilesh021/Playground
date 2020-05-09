/*Counting
These days kids are introduced to computers at a very early age. The kids are taught about alphabets, digits and blank spaces. The teacher asked the students to count the vowels, consonants, digits and white spaces in a string. The teacher found it a bit difficult to evaluate these tests and she knew that the 12th class students are learning C programming. So she assigned this task to them to count the vowels, consonants, digits and white spaces in a string. Can you please help them out? Write a program to count the vowels, consonants, digits, white spaces, and symbols in a string.
Input &output Format:

Input consists of a string. Assume the maximum length of the string is 200. The characters in the string can contain both uppercase and lowercase. Refer sample input and output for formatting specifications.

Sample Input:

This program is very easy 2 complete

Sample Output:

Vowels : 10

Consonants : 19

White spaces : 6

Digits : 1

Symbols : 0*/#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int v=0,c=0,dg=0,sy=0,sp=0;
  for(int i=0;i<s.length();i++)
  {
    if((s[i]>='a' && s[i]<='z')||(s[i]>='A' && s[i]<='Z')){
      if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || 
         s[i]=='A' || s[i]=='E' || s[i]=='I' ||s[i]=='O' || s[i]=='U'){
         v++;
      }
      else{
        c++;
      }
    }
    else if(s[i]>='0' && s[i]<='9'){
      dg++;
    }
     else if(s[i]==' ')
             sp++;
     else
          sy++;
      }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<sp;
  cout<<"\nDigits:"<<dg;
  cout<<"\nSymbols:"<<sy;
  return 0;
    }