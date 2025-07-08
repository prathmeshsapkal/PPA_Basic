#include<iostream>
using namespace std;

class Base
{
    public:
        void Fun()                     //Defination
        {
            cout<<"Inside Base Fun\n";
        }
};
class Derived : public Base
{
    public:
        void Fun()                    //Redefination
        {
            cout<<"Inside Derived Fun\n";
        }
};

int main()
{
    cout<<sizeof(Base)<<"\n";
    


    return 0;
}