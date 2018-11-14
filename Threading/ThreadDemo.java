class MyThread extends Thread
{
	public void run() {
		//for(int i = 0;i<1000;i++){
			System.out.println("Child Thread");
	//	}
	}
	
	public void start(){
		super.start();
		System.out.println("Start main method thread");
	}
	

}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		
		//for(int i = 0;i<1000;i++){
			System.out.println("Main Thrad");
		//}

	}

}
