#include<iostream>
using namespace std;

int main()
{
    int No1 = 10;

    const int No2 = 10;

    No1++;  //Allowed
    No2++;  // Not Allowed

    No1 = 21;
    No2 = 21;


    return 0;
}