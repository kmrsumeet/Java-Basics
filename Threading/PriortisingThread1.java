class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
public class PriortisingThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t = new MyThread2();
		t.setPriority(10);
		t.start();
		for(int i = 0;i<10;i++){
			System.out.println("Main Thread");
		}

	}

}
