class Display {
	public synchronized void wish(String name){
		for(int i=0;i<5;i++){
			System.out.println("Good morning " + name);
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Thread Interrupted");
		}
		System.out.println(name);
	}
}

class MyThread14 extends Thread {
	
	Display d;
	String name;
	public MyThread14(Display d, String name) {
		// TODO Auto-generated constructor stub
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}

public class SynchronizedDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1 = new Display();
	//	Display d2 = new Display();
		MyThread14 t1 = new MyThread14(d1, "Sumeet");
		MyThread14 t2 = new MyThread14(d1,"Ravi");
		t1.start();
		t2.start();
	}

}
