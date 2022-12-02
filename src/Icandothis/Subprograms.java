package Icandothis;

import java.util.Scanner;

public class Subprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input first string: ");
		String FirstString = in.next();
		System.out.println("input second string: ");
		String SecString = in.next();
		int StringLength = Math.max(FirstString.length(), SecString.length());
		
		for (int i = 0; i<StringLength; i++) {
			if (i<FirstString.length()) {
				System.out.print(FirstString.charAt(i));
			}
			if (i<SecString.length()) {
				System.out.print(SecString.charAt(i));
			}
		}
	}

}
