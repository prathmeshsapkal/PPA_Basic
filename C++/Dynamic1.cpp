#include<iostream>
using namespace std;

int main()
{
    int Arr[5];         //Static memory

    int *ptr = NULL;
    //step 1 : Allocate the memory
    ptr = new int[5];
    //ptr = (int*)malloc(5* sizeof(int));

    //Step 2: use the memory
    //logic
    //step 3: Deallocate the memory
    delete []ptr;
    return 0;
}