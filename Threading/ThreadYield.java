class MyThread5 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		//	Thread.yield();
						System.out.println("Child Thread");
		}
	}
}
public class ThreadYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 t = new MyThread5();
		t.start();
		for(int i=0;i<10;i++){
			Thread.currentThread().setPriority(10);
			Thread.yield();

			System.out.println("Main Thread");
		}

	}

}
