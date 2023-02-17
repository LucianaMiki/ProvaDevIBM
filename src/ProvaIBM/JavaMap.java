
package ProvaIBM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	private static Scanner inputScanner;

	public static void javaMap() {

		Map<String, String> phoneBook = new HashMap<String, String>();
		inputScanner = new Scanner(System.in);

		int qtdAmigos = inputScanner.nextInt();
		inputScanner.nextLine();

		for (int i = 0; i < qtdAmigos; i++) {
			String nome = inputScanner.nextLine();
			String numero = inputScanner.nextLine();
			phoneBook.put(nome, numero);
		}

		while (inputScanner.hasNext()) {
			String inputNome = inputScanner.nextLine();

			if (phoneBook.containsKey(inputNome)) {
				System.out.println(inputNome + "=" + phoneBook.get(inputNome));
			} else {
				System.out.println("Not found");
			}

		}

	}

}