package Icandothis;

public class Repitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random number generator
		int a = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
		int b = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
		int c = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
		int aa = 0;
		int bb = 0;
		int cc = 0;
		int i=1;
		do {
			aa = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
			bb = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
			cc = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
			i++;
			}while(aa!=a || bb!=b || cc!=c); 
			System.out.println("it took "+i+" attemps to find the number");
		}
	}
