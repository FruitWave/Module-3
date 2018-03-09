package interfaces;

public class ClassesAndConstructorsMarchEighth {
	public static void main(String[] args) {
		new ClassesAndConstructorsMarchEighth();
	}

	ClassesAndConstructorsMarchEighth() {
		C b = new C();
	}

	class A {
		public A() {
			System.out.println("A");
		}
	}
	
	class B extends A{
		public B() {
			
			System.out.println("B");
		}
	}
	
	class C extends B{
		public C() {
			System.out.println("C");
		}
	}

}
