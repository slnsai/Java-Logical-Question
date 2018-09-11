
public class A {
		int data=10;
	A(){
		B b=new B(this);
		b.display();
		System.out.println("Main Constractor");
	}

	public static void main(String[] args) {
		A a=new A();
	}

}
