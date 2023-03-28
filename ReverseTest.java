/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.net.*;
public class ReverseTest {

    /**
     * @param args the command line arguments
     * @throws UnKnownHostException
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args)throws UnknownHostException {
        // TODO code application logic here
        InetAddress ia = InetAddress.getByName("192.168.1.238");
    System.out.println(ia.getCanonicalHostName());
    
    }
    
}
