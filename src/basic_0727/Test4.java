package basic_0727;

public class Test4 {
	
	
	public static int add(int a) { //add 함수 선언 (declaration) 및 정의(define/definition)
		int result = 0;
		result = a*10;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 45;
		
		int [] q = {3,4,5,6};
		
		add(result);
		System.out.println(add1(4));
		for(int i =0; i<10; i++) {
			int temp = add(i*20); //반복문을 통해 여러번 호출 가능함
			System.out.println(temp);
		}
		
		int t[] = new int[10];
 	
		int j =0;
		for(int i=0; i<q.length; i++) {
			int y = 0;
			y = add(q[i]);
			if(y%3 ==0 ) {
				t[j] = y;	
				j++;
			}
		}
		for(int p : t) {
			System.out.println(p);
			}
		//함수 호출 후 반환되는 값을 받을 수 있도록 변수 정의 하고 정의된 변수에 반환된 값을 저장하고 그 저장된 값을 출력하세요
	
		
		//출력문은 별도로 작성하세요
	
		

	}

	private static int add1(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
		return 3;
	}

}
