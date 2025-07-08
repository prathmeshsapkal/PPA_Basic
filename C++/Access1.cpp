#include<iostream>
using namespace std;

class Base
{
    public:
        int i;
    private:
        int j;
    protected:
        int k;
    public:
        Base()
        {
            i = 10;
            j = 20;
            k = 30;
        }
        void Gun()
        {
            cout<<i<<"\n";  //Allowed
            cout<<j<<"\n";  //Allowed
            cout<<k<<"\n";  //Allowed
        }

};

class Derived : public Base
{
    public:
        void Fun()
        {
            cout<<i<<"\n";  //Allowed
            cout<<j<<"\n";  //Not Allowed
            cout<<k<<"\n";  //Allowed
        }
                
};

int main()
{
    Base bobj; 

    cout<<bobj.i<<"\n";  //Allowed
    cout<<bobj.j<<"\n";  //Not Allowed
    cout<<bobj.k<<"\n";  //Not Allowed

    return 0;
}