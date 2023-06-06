import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostnameFinder {
    public static void main(String[] args) {
        String address = "127.0.0.1"; // Replace with the IP address or domain name you want to find the hostname for

        try {
            InetAddress inetAddress = InetAddress.getByName(address);
            String hostname = inetAddress.getHostName();
            System.out.println("Hostname: " + hostname);
        } catch (UnknownHostException e) {
            System.err.println("Unable to find hostname for address: " + address);
            e.printStackTrace();
        }
    }
}
