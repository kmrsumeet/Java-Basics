class MyThread12 extends Thread{
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("I am lazy thread");
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("I got interrupted");
		}
	}
}

public class InterruptThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread12 t = new MyThread12();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
		

	}

}
