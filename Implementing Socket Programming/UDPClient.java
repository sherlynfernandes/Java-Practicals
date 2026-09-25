import java.net.*;
import java.util.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = sc.nextLine();

        byte[] send = message.getBytes();

        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dp = new DatagramPacket(
                send, send.length, ip, 5000);

        ds.send(dp);

        byte[] receive = new byte[1024];

        DatagramPacket dp2 = new DatagramPacket(
                receive, receive.length);

        ds.receive(dp2);

        String reply = new String(
                dp2.getData(), 0, dp2.getLength());

        System.out.println("Server: " + reply);

        ds.close();
    }
}