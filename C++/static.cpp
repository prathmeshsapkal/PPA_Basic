#include<iostream>
using namespace std;

class Demo 
{
    public:
        int i,j;
        static int k; //not allowed to initialized in constructor 

        Demo()
        {
            i = 10;
            j = 20;
        }
        void Fun() //inside non-static method we can access static as well as non static data 
        {
            cout<<"Inside non static Fun\n";
            cout<<this->i<<"\n";
            cout<<this->j<<"\n";
            cout<<k<<"\n";
        }
        static void Gun() //inside static method we can access only the static data 
        {
            cout<<"Inside static Gun\n";
            cout<<k<<"\n";
        }
};
int Demo :: k = 30; // have to initialized the static characteristics outside the class
int main()
{
    cout<<"Value of k is : "<<Demo::k<<"\n"; //before creating the object we can acess static characteristics 
    Demo::Gun();                             //and static methods 

    Demo obj1;
    Demo obj2;

    obj1.Fun();
    obj2.Fun();

    obj1.Gun();
    obj2.Gun();

    cout<<"Value of K using object : "<<obj1.k<<"\n";
    cout<<"Value of K using object : "<<obj2.k<<"\n";


    return 0;
}
/*Benefits of thee Usage:
1.You can access static members without creating an object of the class. 
  We can call using the only the classname(no need to create object for that)
2.Static members exist only once per class, not per object, saving memory.
3.A static field or method is shared across all instances of the class.
*/