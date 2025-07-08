#include<stdio.h>
 
struct Demo
{
    int no;
    float f;
    
};
struct PPA
{
    int x;               //4
    struct Demo dobj;    //8
    int y;               //4
};                       //16

int main()
{
    struct PPA obj;

    obj.x = 10;
    obj.y = 20;
    obj.dobj.no = 11;
    obj.dobj.f = 3.14;
    
    return 0;
}