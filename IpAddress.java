/**
 * 
 */
package IPADDRESS;

/**
 * @author CamilleDayao
 * *@Description : To Implement an IpAddress class that stores an IP address as a dotted-decimal string and as four octet ints.
 *@DateCreated : 23/05/2022   
 */
public class IpAddress {
	private String decimalVal;
	private int first;
	private int second;
	private int third;
	private int fourth;
	
	public IpAddress (String decimalVal) {			//IP Value setter
		this.decimalVal = decimalVal;
	}
	
	public String getDottedDecimal() {				// IP value getter
		return decimalVal;
	}
	
	public int getOctet (int octetVal){				// to determine the octet value
		
		
		int index1 = decimalVal.indexOf(".");			//1st index 
		String ind1 = decimalVal.substring(0, index1);
		
		int index2 = decimalVal.indexOf(".", index1+1);	//2nd index
		String ind2 = decimalVal.substring(index1 +1, index2);

		int index3 = decimalVal.indexOf(".", index2+1);	//3rd index
		String ind3 = decimalVal.substring(index2 +1, index3);
		
		decimalVal.indexOf(".", index3+1);
		String ind4 = decimalVal.substring(index3 +1);	//4th index
		
		if(octetVal == 1) {								//1st octet
		first = Integer.parseInt(ind1);					//toInt conversion of 1st octet
		octetVal = first;
		}

		else if(octetVal == 2) {						//2nd octet
		second = Integer.parseInt(ind2);				//toInt conversion of 2nd octet
		octetVal = second;
		}
		
		else if(octetVal == 3) {						//3rd octet
		third = Integer.parseInt(ind3);					//toInt conversion of 3rd octet
		octetVal = third;
		}
		
		else if(octetVal == 4) {						//4th octet
		fourth = Integer.parseInt(ind4);				//toInt conversion of 4th octet
		octetVal = fourth;
	}
		return octetVal;
		
		

}
}
