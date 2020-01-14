package JavaProgrammingQuestions;

public class Kangaroo {

	public static void main(String[] args) {

		boolean result = false;
		int x1 = 0;
		int v1 = 1;
		int x2 = 5;
		int v2 = 3;
		for (int i = 0; i < 10000; i++) {
			x1 = x1 + v1;
			x2 = x2 + v2;
			if (x1 == x2) {
				result = true;
				break;
			}
		}
		if (result == true)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
