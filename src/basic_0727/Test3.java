package basic_0727;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {23,12,45,98,54};
		
		int [] result = new int [6]; //{54,98,45,12,23}
		
		int [] b = new int[6];
	
		
		for(int i =0; i<a.length; i++) {
			result[5 - i] = a[i];
		}
		for(int i : result) {
			System.out.println(i);
		}
		
		//a 배열과 b배열의 값은 index 해당하는 값을 더하고 그 결과가 3의 배수이면 result 의 
		//해당 index에 값을 5배 하여 저장하고 그렇지 않은 index에는 10을 저장함 
		
		for (int i=0; i<6; i++) {
			if((a[i] + b[i])%3 ==0)
			{
				result[i] = a[i] + b[i]*5;
			}
			else result[i] = 10;
		}
		
		
	}

}
