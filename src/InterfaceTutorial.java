interface inter1{
	public void methodOne();
}
interface inter2{
	public void methodOne();
}
interface inter3 extends inter1,inter2{
}
public class InterfaceTutorial implements inter3{
	public void methodOne(){
		System.out.println("This is method one");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTutorial obj = new InterfaceTutorial();
		obj.methodOne();

	}

}
