package basic_0727;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {23,12,45,12,98,54};
		
		for(int i=0; i< a.length; i++) System.out.println("정렬전 데이터" + a[i]);
		for(int i=0; i<a.length; i++) {
			for(int j =0; j<a.length; j++) {
				if(a[i] >a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j] =temp;
				}
			}
		}
	
	for(int i =0; i<a.length;i++) System.out.println("정렬후 데이터"+a[i] );
	}

}
