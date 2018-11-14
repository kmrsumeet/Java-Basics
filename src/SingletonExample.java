class Test{
private static Test t = null;
	
	private Test(){
		
	}
	
	public static Test getTest() //getTest() is a factory method
	{
		if(t == null){
			t = new Test();
		}
		return t;
	}
	
}

public class SingletonExample {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		
	}

}
