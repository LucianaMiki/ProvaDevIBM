
package ProvaIBM;

public class JavaSingleton {

	static JavaSingleton instance = new JavaSingleton();

	private JavaSingleton() {
	}

	public String str;

	static JavaSingleton getSingleInstance() {
		return instance;
	}

}