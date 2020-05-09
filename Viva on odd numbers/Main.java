

/*A maths teacher asks her students to give 3 examples for positive odd numbers.
 When the student specifies a correct answer,
  his/her score is incremented by 1. 
  When the student specifies a positive even number,
   his/her score is decremented by 0.5.
    When the student specifies a negative number,
	 he/she will not be given any more chances to correct his or her mistake and his/her 
	 score will be decremented by 1. So a student's 
	 turn comes to an end when he/she has correctly specified 3 positive odd numbers 
	 or when the student has specified a negative number.
	  Some students didn't know the difference between odd numbers
	   and even numbers and they made many mistakes and so it was difficult
	    for the teacher to maintain the scores. The teacher asks for your
		 help. Can you please help her by writing a program to calculate 
		 the score?*/
#include<iostream>
using namespace std;
int main()
{
	int a[30],i=0,odd=1;
	float score=0;
 while(odd!=4)
 {
   cin>>a[i];
   if(a[i]>0)
   {
   	
   	 if(a[i]%2!=0){//odd
   	   score += 1;
   	    odd++;
   	    i++;
   	    continue;
   	}
   	else{
	   
	   score -= 0.5;
	    i++;
   	    continue;   
   }
   	
   	
   	
   }
   else{
   	score-=1;
   	break;
   	
   }   	
 	
 	
 }
 
 cout<<score;
}