class A1{
	public void marvel(){
		System.out.println("Iron Man");
	}
}
class B1 extends A1{
	public void marvel(){
		System.out.println("Dr Strangers");
	}
}
public class OverridingNonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		a.marvel();
		B1 b = new B1();
		b.marvel();
		A1 a1 = new B1();
		a1.marvel();

	}

}
