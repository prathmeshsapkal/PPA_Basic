#include<iostream>
using namespace std;

namespace Marvellous
{
    class Demo
    {
        public:
        void Display()
        {
            cout<<"Inside Display Method\n";
        }
    };
}
int main()
{
    Marvellous :: Demo obj; //Change is Here....
    obj.Display();

    return 0;
}