
package ProvaIBM;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class JavaInterface implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;

			}
		}
		System.out.println(sum);
		return sum;
	}

	public void javaInterface() {
		Scanner inputScanner = new Scanner(System.in);

		int inputSum = inputScanner.nextInt();
		divisor_sum(inputSum);
	}
}