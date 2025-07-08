#include<stdio.h>
int main()
{
    int Standard = 0;
    

    printf("Enter your Standard : \n");
    scanf("%d",&Standard);

    switch(Standard)
    {
        case 1:
            printf("your exam is at 8AM\n");
            break;
        case 2:
            printf("your exam is at 9AM\n");
            break;
        case 3:
            printf("your exam is at 10AM\n");
            break;
        case 4:
            printf("your exam is at 11AM\n");
            break;
        default:
            printf("you entered wrong choice\n");

    }
    return 0;
}