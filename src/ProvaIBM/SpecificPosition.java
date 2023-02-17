
package ProvaIBM;

import java.util.Scanner;

public class SpecificPosition {
	static class Node {
		public int data;
		public Node nextNode;

		public Node(int data) {
			this.data = data;

		}
	}

	static Node GetNode(int data) {
		return new Node(data);
	}

	static Node InsertPos(Node headNode, int position, int data) {
		Node head = headNode;
		if (position < 1)
			System.out.print("Invalid position");

		if (position == 1) {
			Node newNode = new Node(data);
			newNode.nextNode = headNode;
			head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					Node newNode = GetNode(data);

					newNode.nextNode = headNode.nextNode;

					headNode.nextNode = newNode;
					break;
				}
				headNode = headNode.nextNode;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	static void PrintList(Node node) {
		while (node != null) {
			System.out.print(node.data);
			node = node.nextNode;
			if (node != null)
				System.out.print(",");
		}
		System.out.println();
	}

	public static void specificPosition() {
		Scanner sc = new Scanner(System.in);
		String headAux = sc.nextLine();
		Node headNode;
		int[] head = {};

		int i;
		int j;

		for (i = 0; i < headAux.length(); i++) {
			char c = headAux.charAt(i);
			if (c == "-".charAt(0)) {
				for (j = i; j > 0; j--) {
					headNode = GetNode(head[i]);
					StringBuilder sb = new StringBuilder(head[1]);
					sb.insert(j, c);
				}
				;
			}
		}
		for (i = 0; i < headAux.length(); i++) {
			char c = headAux.charAt(i);
			if (c == ">".charAt(0)) {
				for (j = i; j < headAux.length(); j++) {
					char ch = headAux.charAt(i);
					if (ch == "-".charAt(0)) {
						headNode = GetNode(head[i]);
						StringBuilder sb = new StringBuilder(head[i]);
						sb.insert(j, c);
					}
				}
			}
		}
		PrintList(headNode);
	}

}