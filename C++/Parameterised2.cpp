#include<iostream>
using namespace std;

class Demo
{
    public:
        int No1,No2,No3;

        //parameterised constructor with DEFAULT
        Demo(int A = 11, int B = 21, int C = 51)
        {
            No1 = A;
            No2 = B;
            No3 = C;
        }
};
int main()
{
    Demo obj1();
    Demo obj1(10);
    Demo obj1(10,20);
    Demo obj1(10,20,30);


    returm 0;
}