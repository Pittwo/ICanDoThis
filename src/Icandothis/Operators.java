package Icandothis;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number:");
		int og = in.nextInt();
		System.out.println(og+"- 1 = "+(og-1));
		int fg = og-1;
		System.out.println(fg+" x 3 = "+fg*3);
		fg = fg*3;
		System.out.println(fg+" + 12 = "+(fg+12));
		fg = fg+12;
		System.out.println(fg+" / 3 = "+fg/3);
		fg = fg/3;
		System.out.println(fg+" + 5 = "+(fg+5));
		fg = fg+5;
		System.out.println(fg+" - "+og+" = "+(fg-og));
				
	}

}
