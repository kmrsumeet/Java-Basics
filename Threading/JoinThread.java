class MyThread7 extends Thread
{
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println("Child Thread");
		}
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			
		}
	}
}

public class JoinThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread7 t = new MyThread7();
		t.start();
		t.join();
		for(int i = 0;i<10;i++){
			System.out.println("Main Thread");
		}
		

	}

}
