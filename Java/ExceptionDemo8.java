import java.io.*;


class ExceptionDemo8
{
    public static void main(String A[]) throws IOException
    {
        BufferReader bobj = new BufferdReader(new InputStreamReader(System.in));

        System.out.println("Enter your Name :");
        String name = bobj.readline();

        System.out.println("Enter your Age :");
        int Age = Integer.parseInt (bobj,readline());

        System.out.println("Your name is :"+name);
        System.out.println("your age is :"+Age);    
    }    

        
}