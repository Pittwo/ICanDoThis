package Icandothis;

import java.util.Scanner;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input amount including cents:");
		double money = in.nextDouble();
		double tax = 0;
		if (money > 49020) {
			double money1 = money-49020;
			if (money1 > 49020) {
				double moneyremaining1 = (money-49020);
				tax = 0.15*49020;
				if (moneyremaining1 > ) {
					if (moneyremaining1 > 98040 && moneyremaining1 <=151978) {
						tax = tax + 0.26*moneyremaining1;
					}else if (moneyremaining1 > 151978) {
						moneyremaining1 = moneyremaining1-151978;
						tax = tax + 0.26*151978;
						if (moneyremaining1 > 151978 && moneyremaining1 <= 216511) {
						tax = tax + 0.29*moneyremaining1;
						}else if (moneyremaining1 > 216511) {
							moneyremaining1 = moneyremaining1-216511;
							tax = tax + 0.29*216511;
							if (moneyremaining1 > 216511) {
							tax = tax + 033*moneyremaining1;
							}
						}
					}
				}
			}
		}else {
				tax = 0.15*money;
			}
	System.out.println("your tax is:"+tax);	
	}

}
