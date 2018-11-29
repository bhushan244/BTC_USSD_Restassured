package lambda_expression;
//1.8 onwards static and default concrete methods are allowed in java interface

@FunctionalInterface
public interface Functiuonal_Interface {
	static void m1() {
		System.out.println("static method in interface");
	}

	default void m2() {
		System.out.println("Default method in interface");
	}

	void m3();// by default m3 is public and abstract
	// void m4();---will give error since @FunctionalInterface accepts only one
	// abstract methods
}

class Test {
	public static void main(String[] args) {
		Functiuonal_Interface i = () -> System.out.println("Lambda Expression");
		i.m3();
	}
}