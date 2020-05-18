#include <iostream> 
#include<stdlib.h>
#include <bits/stdc++.h> 
using namespace std; 

   
// Function to find the largest 
// possible k-multiple set 

void K_multiple(int a[], int n, int k) 
{ 

    // Sort the given array 

    sort(a, a + n); 

   

    // To store k-multiple set 

    set<int> s; 

   

    // Traverse through the whole array 

    for (int i = 0; i < n; i++) { 

        // Check if x/k is already present or not 

        if ((a[i] % k == 0 && s.find(a[i] / k) == s.end())  

            ) 

            s.insert(a[i]); 

    } 

   

    // Print the k-multiple set 
    cout<<s.size()<<endl;
    for (auto i = s.begin(); i != s.end(); i++) 

        cout << *i << endl; 
} 

   
// Driver code 

int main() 
{ 
    int n,k;
 cin>> n >> k;
    int a[100]; 
    for(int i=0;i<n;i++)
    {
    cin>>a[i];    
        
    }

    

   

 

   

    // Function call 

    K_multiple(a, n, k); 

   

    return 0; 
}
