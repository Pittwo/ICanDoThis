package Icandothis;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrays
		 Scanner in = new Scanner(System.in);
		 System.out.println("input desired array length");
		 int arrLength = in.nextInt();
		 double[] arr = new double[arrLength];
		 for (int i=0; i<arrLength; i++) {
			 System.out.println("enter value for position "+(i+1)+":");
			 arr[i] = in.nextInt();
		 }
		 int n = arr.length;
			for (int o=0; o<n; o++)
				for (int k=0; k<n-o-1; k++)
					if (arr[k]>arr[k+1]) {
						double temp = arr[k];
						arr[k] = arr[k+1];
						arr[k+1] = temp;
					}
		 System.out.println("the highest value in the array is: "+arr[arr.length-1]);
		 System.out.println("the lowest value in the array is: "+arr[0]);
		 double sum = 0;
		 for (int a=0; a<arr.length; a++) {
			 sum += arr[a];
		 }
		 double aver = sum/arrLength;
		 System.out.println("the average for this set of numbers is: "+aver);
		 
		 //nested
		 System.out.println("input first value:" );
		 int first = in.nextInt();
		 System.out.println("input second value:" );
		 int sec = in.nextInt();
		 for (int i=first; i<=sec; i++) {
			 for (int j=first; j<=sec; j++) {
				 
				 System.out.print(j*i+"\t");
			 }
			 System.out.println();
		 }
	}

}
