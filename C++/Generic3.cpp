#include<iostream>

using namespace std;

float Addition(float No1, float No2)
{
    float Ans = 0.0f;
    Ans = No1 + No2;
    return Ans;

}
int main()
{

    float A = 10, B = 11;

    cout<<Addition(A,B)<<"\n";

    return 0;
}