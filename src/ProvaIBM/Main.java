
package ProvaIBM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Menu
		ArrayList<Opcao> opcoes = new ArrayList<Opcao>();

		opcoes.add(new Opcao(1, "Java Map", "JavaMap"));
		opcoes.add(new Opcao(2, "Java Method Overriding (Super Keyboard)", "JavaMethod"));
		opcoes.add(new Opcao(3, "Java Abstract Class", "JavaAbstract"));
		opcoes.add(new Opcao(4, "Java Interface", "JavaInterface"));
		opcoes.add(new Opcao(5, "Java Exception Handling (Try-catch)", "JavaException"));
		opcoes.add(new Opcao(6, "Simple Array Sum", "SimpleArraySum"));
		opcoes.add(new Opcao(7, "Two Characters", "TwoCharacters"));
		opcoes.add(new Opcao(8, "Java Singleton Pattern", "JavaSingleton"));
		opcoes.add(new Opcao(9, "Java Factory Pattern", "JavaFactory"));
		opcoes.add(new Opcao(10, "Java List", "JavaList"));
		opcoes.add(new Opcao(11, "Java Generics", "JavaGenerics"));
		opcoes.add(new Opcao(12, "String Reverse", "StringReverse"));
		opcoes.add(new Opcao(13, "Insert a node at a specific position in a linked list", "SpecificPosition"));

		System.out.println("Digite o número do exercício desejado: ");
		for (int counter = 0; counter < opcoes.size(); counter++) {
			System.out.print(opcoes.get(counter).id + " - ");
			System.out.print(opcoes.get(counter).nome + "\n");
		}

		Scanner input = new Scanner(System.in);
		int escolha = input.nextInt();

		for (int counter = 0; counter < opcoes.size(); counter++) {
			if (escolha == opcoes.get(counter).id) {
				System.out.print("A opcao escolhida foi: " + opcoes.get(counter).nome + "\n");
				callMethod(opcoes.get(counter));
			}
		}

	}

	private static void callMethod(Opcao opcao) {
		String classe = opcao.classe;
		JavaInterface ji = new JavaInterface();
		switch (classe) {
		case "JavaMap":
			JavaMap.javaMap();
			break;
		case "JavaMethod":
			JavaMethod.javaMethod();
			break;
		case "JavaAbstract":
			JavaAbstract.javaAbstract();
			break;
		case "JavaInterface":
			ji.javaInterface();
			break;
		case "JavaException":
			JavaException.javaException();
			break;
		case "SimpleArraySum":
			SimpleArraySum.simpleArraySum();
			break;
		case "TwoCharacters":
			TwoCharacters.twoCharacters();
			break;
		case "JavaSingleton":
			JavaSingleton.getSingleInstance();
			break;
		case "JavaFactory":
			JavaFactory.javaFactory();
			break;
		case "JavaList":
			JavaList.javaList();
			break;
		case "JavaGenerics":
			JavaGenerics.javaGenerics();
			break;
		case "StringReverse":
			StringReverse.stringReverse();
			break;
		case "SpecificPosition":
			SpecificPosition.specificPosition();
			break;
		default:
			System.out.print("Nenhuma opcao escolhidda");
		}
	}

	static class Opcao {

		int id;
		String nome;
		String classe;

		public Opcao(int id, String nome, String classe) {
			this.id = id;
			this.nome = nome;
			this.classe = classe;
		}
	}
}
