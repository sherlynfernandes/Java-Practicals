import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIServer extends JFrame implements ActionListener {

    JTextField text;
    JButton send;
    ServerSocket ss;
    Socket s;
    DataOutputStream dos;
    DataInputStream dis;

    GUIServer() {

        text = new JTextField();
        send = new JButton("Send");

        setLayout(new BorderLayout());

        add(text, BorderLayout.CENTER);
        add(send, BorderLayout.EAST);

        send.addActionListener(this);

        setSize(400, 100);
        setTitle("Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        try {
            ss = new ServerSocket(5000);

            System.out.println("Server waiting for client...");

            s = ss.accept();

            System.out.println("Client connected!");

            dos = new DataOutputStream(s.getOutputStream());
            dis = new DataInputStream(s.getInputStream());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent e) {

        try {
            String message = text.getText();

            dos.writeUTF(message);
            text.setText("");

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new GUIServer();
    }
}