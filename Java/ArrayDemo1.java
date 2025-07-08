

class ArrayDemo1
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40};

        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        System.out.println(Arr[3]);

        System.out.println(Arr.length);

        Arr[0] = 10;
        Arr[1] = 20;
        Arr[2] = 30;
        Arr[3] = 40;
        
        System.out.println(Arr.length);


        //int Arr2[4] = {10,20,30,40}; //only in c++ not in java
    }
}