package basic_0727;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num[] = new int[5];
		
		for(int i =0; i<5; i++) {
			num[i] = scr.nextInt();
			num[i] *= 5;
			System.out.println(num[i]);
		}
		
		

	}

}
