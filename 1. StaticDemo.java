
public class ClassesDemo {
	
//	1. static block
//	2. static functions
//	3. static variables
	
	static int x = 69;
	
	static void fun() {
		System.out.println("static function.");
	}
	
	static {
		System.out.println("First static block.");
	}

	public static void main(String[] args) {
		System.out.println("Main block.");
		ClassesDemo.fun();
		System.out.println(x);
	}
	
	static {
		System.out.println("second static block.");
	}

}
