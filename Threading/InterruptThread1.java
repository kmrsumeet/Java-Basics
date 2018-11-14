class MyThread13 extends Thread{
	public void run(){
		
			for(int i=0;i<5;i++){
				System.out.println("I am lazy thread");
			}try{
				Thread.sleep(1000);
			
		}catch(InterruptedException e){
			System.out.println("I got interrupted");
		}
	}
}

public class InterruptThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread13 t = new MyThread13();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
		

	}

}
