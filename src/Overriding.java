class Parent{

	public void property(){
		System.out.println("Gold & Land");
	}
	public void marry(){
		System.out.println("Penny");
	}
}
class Child extends Parent{
	public void marry(){
		System.out.println("Robin");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.marry();
		Child c = new Child();
		c.marry();
		Parent p1 = new Child();
		p1.marry();
		
		
	}

}
