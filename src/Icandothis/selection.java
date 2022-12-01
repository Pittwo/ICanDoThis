package Icandothis;

import java.util.Scanner;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input amount including cents:");
		double money = in.nextDouble();
		double tax1 = 0;
		
		if (money < 49020) {
			tax1 += 0.15*money;
		}else if (money > 49020) {
			tax1 += 0.15*49020;
			if (money < 98040) {
				tax1 += 0.205*(money - 49020);
			}else if (money > 98040) {
				tax1 += 0.205*(98040 - 49020);
				if (money < 151978) {
					tax1 += 0.26*(money - 98040);
				}else if (money > 151978) {
					tax1 += 0.26*(151978 - 98040);
					if (money < 216511) {
					tax1 += 0.29*(money - 151978);
					}else if (money > 216511) {
						tax1 += 0.33*(money - 216511);
						
					}
				}
			}
		System.out.println("your tax is: "+(tax1));
		}
	}
}
