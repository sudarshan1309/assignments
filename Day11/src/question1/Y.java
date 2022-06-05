package question1;

public interface Y {
	void method_Y1();
	
	
	default  void method_Y2() {
		System.out.println("inside default method_Y2 of Y interface");
	}
	
	public static void method_Y3() {
		System.out.println("inside public method_Y3 of Y interface");
	}
}
