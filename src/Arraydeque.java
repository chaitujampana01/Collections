import java.util.ArrayDeque;

public class Arraydeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad);
		ad.add(100);
		System.out.println(ad);
		ad.add(null); 
	}

}
