import java.net.*;
public class AddressTests {
  public static void main(String[] args)throws UnknownHostException {
        // TODO code application logic here
        InetAddress ia = InetAddress.getByName("ABCD:0000::1234:AD00:0000");
        byte[] address = ia.getAddress();
        if (address.length == 4){
            System.out.println("4");}
        else if (address.length == 16) {System.out.println("6");}
        
    
      };
  }
