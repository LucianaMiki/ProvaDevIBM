
package ProvaIBM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {

	public static void javaException() {
		Scanner sc = new Scanner(System.in);
		try {
			try {
				Integer x = Integer.valueOf(sc.nextInt());
				Integer y = Integer.valueOf(sc.nextInt());
				System.out.println("" + (x / y));
			} catch (InputMismatchException e) {
				System.out.println("java.util.InputMismatchException");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}