#include<stdio.h>

int Value = 11; //extern
int Data;       //extern

void Demo()
{
    int i = 10;         //auto
    static int j = 20;  //static
    register int k = 30; //register

    printf("Inside demo function\n");
}
int main()
{
    int *p = NULL;
    p = (int *)malloc(5 * sizeof(int)); // Dynamic memory

    Demo();

    return 0;
}