import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {

        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started...");

        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int num = dis.readInt();
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == num)
            dos.writeUTF(num + " is an Armstrong number");
        else
            dos.writeUTF(num + " is not an Armstrong number");

        s.close();
        ss.close();
    }
}