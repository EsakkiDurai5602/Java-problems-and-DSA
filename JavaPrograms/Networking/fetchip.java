import java.net.*;

public class fetchip {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + local.getHostName());
            System.out.println("Local IP Address: " + local.getHostAddress());

            InetAddress remote = InetAddress.getByName("www.google.com");
            System.out.println("Remote Host Name: " + remote.getHostName());
            System.out.println("Remote IP Address: " + remote.getHostAddress());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
