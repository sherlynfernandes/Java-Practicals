import java.net.*;

public class URLDemo {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.google.com");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("File: " + url.getFile());
        System.out.println("URL: " + url);
    }
}