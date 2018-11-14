class MyThread6 extends Thread{
	
}
public class PriortisingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		MyThread6 t = new MyThread6();
		t.setPriority(7);
		System.out.println(t.getPriority());
	}

}
