
package ProvaIBM;

import java.util.Scanner;

public class SimpleArraySum {

	static Scanner sc = new Scanner(System.in);

	static int sum() {
		int[] arr = new int[sc.nextInt()];
		int i;

		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public static void simpleArraySum() {
		System.out.println(sum());
	}
}