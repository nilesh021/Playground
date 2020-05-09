#include <cstring>
#include <iostream>

using namespace std;

int main()
{
    char str1[50]; 
    std::cin.getline(str1,50);    
    int len1 = strlen(str1);
   //cout<<len1<<"\n";
    if (len1 > 48)
        cout << "Caption not eligible for the contest";
    else 
      cout << "Caption eligible for the contest";

    return 0;
}