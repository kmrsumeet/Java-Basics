import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Integer i = (Integer)itr.next();
			if(i%2 == 0)
				System.out.println(i);
			else
				itr.remove();
		}
		System.out.println(list);
	}

}
