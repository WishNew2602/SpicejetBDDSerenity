package org.Ebay.UtilityActions;

public class reverseString {

	public static void main(String[] args) {
						
		
		String vishnu= "Vishnuvardhan Reddy";
		
		int len = vishnu.length();		
		
		StringBuffer newStr = new StringBuffer("Vishnuvardhan");
		//newStr.reverse();
		
		for(int i = len-1; i >=0; i--) {
			
			newStr.append(vishnu.charAt(i));
			
		}

		System.out.println(newStr.toString());

	}

}
