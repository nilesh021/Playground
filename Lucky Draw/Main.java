#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
bool isprime(int x)
{
   // Corner case 
    if (x <= 1) 
        return false; 
  
    // Check from 2 to n-1 
    for (int i = 2; i < x; i++) 
        if (x % i == 0) 
            return false; 
  
    return true; 
 
}

int main()
{
  int a;
  cin>>a;


    isprime(a) ? cout << "Eligible" : cout << "Not eligible"; 

}