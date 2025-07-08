class Student implements Cloneable // clss Student extends Object implements Clonable
{
    public String Name;
    public int Age;
    public int Marks;

    public Student(String A, int B, int C)
    {
        this.Name = A;
        this.Age = B;
        this.Marks = C;
    }

    public Object clone() throws CloneNotSuportedException
    {
        return super.clone();
    }
}


class ObjectDemo4
{
    public static void main(String A[])
    {
        try
        {
            Student sobj = new Student ("sagar",21,89);

            Student sobjx = (Student)sobj.clone();

            System.out.println("Name is :"+sobj.Name);
            System.out.println("Age is :"+sobj.Age);
            System.out.println("Marks is :"+sobj.Marks);

            System.out.println("Name is :"+sobjx.Name);
            System.out.println("Age is :"+sobjx.Age);
        
            System.out.println("Marks is :"+sobjx.Marks);
        }
        catch(Exception obj)
        {}
    }
}