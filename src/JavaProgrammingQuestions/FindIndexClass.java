package JavaProgrammingQuestions;

public class FindIndexClass {
	
	static int r,i;

	public static void main(String[] args) {
		
		findIndex(1001);
		
	}
	
	public static void findIndex(int number) {
		Integer[] arr = new Integer[10];
		String s = String.valueOf(number);
		int num = number;
		
		for (i = s.length() ; i >0 ; i--) {
			r = num%10;
			num = num/10;
			arr[i-1]=r;
		}
		
		for(int x = 0 ; x<s.length();x++) {
			if(arr[x]==1) {
				System.out.println(x);
				break;
			}
		}
	}

}
