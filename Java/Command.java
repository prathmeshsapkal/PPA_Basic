class Command
{
    public static void main(String Arg[])
    {
        System.out.println("Number of Command Line arguments are:"+Arg.length);

        for(int i = 0; i < Arg.length; i++)
        {
            System.out.println(Arg[i]);
        }
    }
}

//javac Command.java
//java Command.java Hello 21 Marvellous