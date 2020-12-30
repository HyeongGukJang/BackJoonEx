package ex4673;

public class Main {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; 
		for (int i = 1; i <= 100000; i++) {
			int n = func(i);
			if (n <= 1000) { 
				check[n] = true;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10000; i++) {
			if (!check[i]) { 
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	public static int func(int number) {
		int sum = number;
		while (number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}
}