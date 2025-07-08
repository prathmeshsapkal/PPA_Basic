class Demo
{
    public Demo()
    {
        System.out.println("Inside Constructor");
    }

    protected void finalize()
    {
        Sytsem.out.println("inside finalize method");
    }
}

class ObjectDemo3
{
    public static void main(String A[])
    {
        Demo obj = new Demo();
        obj = null;
        System.gc();

    }
}