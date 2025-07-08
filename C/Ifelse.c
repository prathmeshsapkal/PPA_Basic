#include<stdio.h>
int main()
{
    int No = 0;
    int Result = 0;

    printf("Enter the number : \n");
    scanf("%d",&No);

    Result = No %2;

    if(Result == 0)
    {
        printf("it is Even Number\n");
    }
    else
    {
        printf("it is odd number\n");
    }
    return 0;
}