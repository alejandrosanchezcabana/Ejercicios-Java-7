package edu.upc.eetac.dsa.alejandro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) throws IOException
    {
        if (args.length < 2){
            System.out.println("Ypu have to pass the server port and name");
            System.exit(-1);
        }
        String server=args[0];
        int port = Integer.parseInt(args[1]);

        Socket socket=new Socket(server, port);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String time=bufferedReader.readLine();
        System.out.println(time);
    }
}
