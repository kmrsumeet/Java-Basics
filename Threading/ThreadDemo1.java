class MyRunnable implements Runnable
{
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println("child Thread");
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		Thread t1 = new Thread();
		t.start();
		
		for(int i = 0;i<10;i++){
			System.out.println("Main Thread");
		}

	}

}
