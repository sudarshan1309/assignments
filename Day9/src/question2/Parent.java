package question2;

public class Parent {
	
	final int num;

	 Parent(int num){
		this.num = num;
	}
	
	public void method1() {
		System.out.println("Number:"+ num);
		System.out.println("method1 of parent class");
	}
	
	final void method2() {
		System.out.println("method2 of parent class");
	}
	
	void method3() {
		System.out.println("method3 of parent class");
	}
}
