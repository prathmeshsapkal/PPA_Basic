import java.net.*;
import java.io.*;

class Server
{
    public static void main(String Arg[])throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting for client at port Number 2100");

        Socket sobj = ssobj.accept(); // Accept the request from the client 
        System.out.println("Connection established with the Client...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStream Reader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStream Reader(System.in));
        String str1, str2;

        System.out.println("Marvellous Chat Messanger Application is Started...");
        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            Ststem.out.println("Enter the Message for client :");
            str2 = br2.readLine();
            ps.print(str2);

        }
        System.out.println("thank You for Using the marvellous Chat Application");
    }

}a 