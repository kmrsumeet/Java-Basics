class A{
	public static void car(){
		System.out.println("Maruti");
	}
}

class B extends A{
	public static void car(){
		System.out.println("Hyundai");
	}
}
public class OverridingStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.car();
		A a = new A();
		a.car();
		A a1 = new B();
		a1.car();
		

	}

}
