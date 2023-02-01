/**
 * 
 */
package IPADDRESS;



/**
 * @author CamilleDayao
 *@Description : To Implement an IpAddress class that stores an IP address as a dotted-decimal string and as four octet ints.
 *@DateCreated : 23/05/2022
 */
public class IpAddressdriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IpAddress ip = new IpAddress("216.27.6.136");
		  
		 System.out.println(ip.getDottedDecimal());
		 System.out.println(ip.getOctet(4));
		 System.out.println(ip.getOctet(1));
		 System.out.println(ip.getOctet(3));
		 System.out.println(ip.getOctet(2));
		  

	}

}
