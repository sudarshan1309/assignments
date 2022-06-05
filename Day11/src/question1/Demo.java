package question1;

public class Demo {

	public static void main(String[] args) {
		
		
		X obj = new Zimpl();
		
		
//		===========X interface=============
		System.out.println("=============X interface=============");
		obj.method_X1();
		obj.method_X2();
		X.method_X3();
		
//		==========Y interface==============
		System.out.println("==============Y interface==============");
		Y obj2 = (Y)obj;
		obj2.method_Y1();
		obj2.method_Y2();
		Y.method_Y3();
		
//		=========Z interface================
		System.out.println("===============Z interface================");
		Z obj3 = (Z)obj2;
		obj3.method_X1();
		obj3.method_X2();
		obj3.method_Y1();
		obj3.method_Y2();
		obj3.method_Z1();
		

   }

}