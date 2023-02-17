
package ProvaIBM;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {

	public static void javaList() {

		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < n; ++i) {
			int num = reader.nextInt();
			list.add(num);
		}

		int q = reader.nextInt();
		for (int i = 0; i < q; ++i) {
			String type = reader.next();
			if (type.equals("Insert")) {
				int x = reader.nextInt(), y = reader.nextInt();
				list.add(x, y);
			} else {
				int x = reader.nextInt();
				list.remove(x);
			}
		}

		for (Integer num : list) {
			System.out.print(num + " ");
		}

		System.out.println();
		reader.close();
	}
}