/*WORDAKSHARI
Antakshari is a popular parlor game played in India. Many word games are similar to antakshari. One such game is wordakshari. The game can be played by two or more people. The first player has to recite a word. The last letter of the word is then used by the next player to recite another word starting with that letter. The winner or winning team is decided by a process of elimination. The person or the team that cannot come up with a word with the right consonant is eliminated. The following rules need to be followed while playing this game. (ii) All other words have to begin with the last letter of the previous word (iii) No words can be repeated. write a program to print the wordakshari chain.
Input Fromat:

Input consists of n+1 lines.

The first n lines contain strings corresponding to the words in the chain.

The last line of input contains the string #### to mark the end of input.

Output Format:

The output consists of the valid wordakshari chain.

The first word can begin with any letter.

Sample Input:

architect

tailor

referee

electrician

nurse

blacksmith

####

Sample Output:

architect

tailor

referee

electrician

nurse*/#include<iostream>
#include<cstring>
#include<string>
using namespace std;
int main(){
string s[10];
int count;
for(int i=0;i<10;i++){
  cin>>s[i];
  if(s[i][0]=='#'){
   	count=i;
    break;
  }
}
count++;
string res[count];
res[0]=s[0];
int n=1;
for(int i=0;i<count;i++)
{
    	if(s[i][0] == res[n-1].back())
        {
        	res[n]=s[i];
          	n++;
        }
}
for(int i=0;i<n;i++)
  cout<<res[i]<<"\n";
}