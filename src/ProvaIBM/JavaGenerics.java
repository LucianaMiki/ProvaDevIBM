
package ProvaIBM;

import java.lang.reflect.Method;

class Printer {
	public <inputType> void printArray(inputType[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

public class JavaGenerics {

	public static void javaGenerics() {
		Printer myPrinter = new Printer();

		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);

		int printArrayMethodCount = 0;
		for (Method method : Printer.class.getDeclaredMethods()) {
			String methodName = method.getName();
			if (methodName.equals("printArray")) {
				printArrayMethodCount++;
			}
		}
		if (printArrayMethodCount > 1) {
			System.out.println("Method overloading");
			assert printArrayMethodCount == 1;
		}
	}

}