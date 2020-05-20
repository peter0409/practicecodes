package com.nivtek.plaindrome.checkplaindrome;

/**
 * @author Bootcamp User 007
 *
 */
public class CheckPalindrome {


	public static void main(String[] args) {

		String str = "meoem";

		StringBuffer sb = new StringBuffer(str);

		StringBuffer st = sb.reverse();
		
		//convert stringbuffer to string
		String str1 = st.toString();

		if (str1.equals(str)) {
			System.out.println("this is plaindrome");

		} else
			System.out.println("this is not plaindrome");

	}

}
