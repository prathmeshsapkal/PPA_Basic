import java.net.*;
import java.io.*;

class Client
{
    public static void main(String Arg[])throws Exception
    {
        System.out.println("Client application is running...");
        
        Socket sobj = new Socket("localhost",2100);
        System.out.println("Connection Established with Server..");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStream Reader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStream Reader(System.in));
        String str1, str2;

        System.out.println("Marvellous Chat Messanger Application is Started...");
        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Enter the message for server :");
            System.out.println("Server says: " +str2);
        }
        System.out.println("Thank You for using the Marvellous Chat Application..");

    }
}

