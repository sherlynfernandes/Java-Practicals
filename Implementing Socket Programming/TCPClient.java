import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 5000);

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        dos.writeInt(num);

        String message = dis.readUTF();
        System.out.println(message);

        s.close();
    }
}