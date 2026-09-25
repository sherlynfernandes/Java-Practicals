import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket(5000);

        byte[] receive = new byte[1024];

        DatagramPacket dp = new DatagramPacket(receive, receive.length);

        System.out.println("Waiting for message...");

        ds.receive(dp);

        String message = new String(dp.getData(), 0, dp.getLength());

        System.out.println("Client: " + message);

        String reply = "Hello from Server";

        byte[] send = reply.getBytes();

        DatagramPacket dp2 = new DatagramPacket(
                send, send.length,
                dp.getAddress(), dp.getPort());

        ds.send(dp2);

        ds.close();
    }
}