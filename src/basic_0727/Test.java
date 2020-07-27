package basic_0727;

import java.util.Scanner;

public class Test {
	
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
		
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static float div (int a, int b) {
		return (float) (a/b);
		
	}
	public static int mod (int a, int b) {
		return a%b;
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
	
	//키보드로 입력된 데이터를 5개의 데이터가 5배 한 결과를 배열에 저장되어 있습니다. 
	//저장된 배열의 값을 하나씩 읽어서 5로 나눈 나머지가 1이면 add함수 호출
	//나머지가 2이면 sub함수 호출, 3이면 mul함수 호출, 4이면 div함수 호출 
	//0이면 mod함수 호출, 전달되는 파라미터의 값은 배열의 처음 값과 마지막 값을 전달함 
	
		int num[] = new int[5];
		for(int i =0; i<num.length ; i++) {
			num[i] = scr.nextInt();
		}
		
		
		for(int j : num) {
			if(j%5 == 1) {
				System.out.println(add(num[0], num[4]));
			}
			else if(j%5 ==2) {
				System.out.println(sub(num[0], num[4]));
			}
			else if(j%5 ==3) {
				System.out.println(mul(num[0], num[4]));
			}
			else if(j%5 ==4) {
				System.out.println(div(num[0], num[4]));;
			}
			else if(j%5 ==0) {
				System.out.println(mod(num[0], num[4]));
			}
		}
		
	
	
	}
	
	

}
