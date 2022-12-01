package Icandothis;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("intput an interger: ");
		int UserInteger = in.nextInt();
		System.out.println("input a double: ");
		double UserDouble = in.nextDouble();
		System.out.println("input a string: ");
		String UserString = in.next();
		int RoundedD = (int)Math.round(UserDouble);
		System.out.println("your rounded double is: "+RoundedD);
		int holder = UserInteger;
		UserInteger = RoundedD;
		RoundedD = holder;
		System.out.println("your number and rounded double have been swapped: "+UserInteger+" "+RoundedD);
		String str = UserString.toUpperCase();
		System.out.println("when capitalized, your string is: "+str);
		String first3 = UserString.substring(0,3);
		String rest = UserString.substring(3);
		System.out.println(first3);
		System.out.println(rest);
	}

}
