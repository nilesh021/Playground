#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
float distance(int x1, int y1, int x2, int y2) 
{ 
  int temp;
    // Calculating distance 
     temp=sqrt(pow(x2 - x1, 2) +  
                pow(y2 - y1, 2) * 1.0); 
  return temp;
} 
  
// Drivers Code 
int main() 
{ 
  int x,y;
  cin>>x;
  cin>>y;
    cout << distance(3, 4, x, y); 
    return 0; 
} 