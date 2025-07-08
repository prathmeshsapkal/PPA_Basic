#include<iostream>
using namespace std;

class Demo
{
    public:
        int Addition(int A, int B)
        {
            return A+B;
        }
        double Addition(double A,double B)
        {
            return A+B;
        }
        int Addition (int A,int B, int C)
        {
            return A+B+C;
        }
};

int main()
{
    Demo obj;
    cout<<obj.Addition(10,11);
    cout<<obj.Addition(10.90,11.99);
    cout<<obj.Addition(10,11,20);


    return 0;
}