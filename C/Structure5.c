#include<stdio.h>
#pragma pack(1)
struct Demo
{
    int no;
    char ch;
    float f;

};
int main()
{
    struct Demo obj;

    printf("%d\n",sizeof(obj));




    return 0;
}