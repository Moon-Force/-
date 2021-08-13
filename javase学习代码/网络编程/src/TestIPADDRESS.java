import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIPADDRESS {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("localhost");
            InetAddress inetAddress1 = InetAddress.getLocalHost();
            System.out.println(inetAddress);
            System.out.println(inetAddress1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
