class MyThread1 extends Thread
{
	public void run(){
		System.out.println("Child thread");
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MyThread1 t = new MyThread1();
		System.out.println(t.getName());
		Thread.currentThread().setName("Sumeet Thread");
		System.out.println(Thread.currentThread().getName());
	}

}
