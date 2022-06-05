package question1;

public interface X {
	
	void method_X1();
	
	
	default void method_X2() {
		System.out.println("inside default method_X2 of X interface");
	}
	
	public static void method_X3() {
		System.out.println("inside public method_X3 of X interface");
	}
}

