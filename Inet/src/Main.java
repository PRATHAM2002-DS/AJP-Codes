import java.net.InetAddress;
import java.net.UnknownHostException;


public class Main {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub

		InetAddress ip1 = InetAddress.getByName("www.instagram.com");
		
		
		System.out.println("1. Address of local host : " + InetAddress.getLocalHost());
		
		System.out.println("2. Address of String Host : " + InetAddress.getByName("www.google.com"));

		byte[] ipadaddress = {5,10,15,20};
		System.out.println("3. Host name for IP address : " + InetAddress.getByAddress(ipadaddress));
		
		InetAddress[] obj1 = InetAddress.getAllByName("www.google.com");
		for (InetAddress var : obj1) {
			System.out.println("4. Address of the URL : " + var);
		}
		
		System.out.println("5. InetAddress of host with IP address and IP name : " + InetAddress.getByAddress("www.faccebook.com", ipadaddress));
		
		System.out.println("6. Loopback Address : " + InetAddress.getLoopbackAddress());
		
		System.out.println("7. Host Name : " + ip1.getHostName());
		
		System.out.println("8. Host Address : " + ip1.getHostAddress());
		
		System.out.println("9. Multicast address or not : " + ip1.isMulticastAddress());
		
		
	}

}