import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll1=new LinkedList();
		ll1.add(100);
		ll1.add("add");
		ll1.add(200);
		System.out.println(ll1);
		ll1.addFirst(44);
		ll1.add(2, 54);
		System.out.println(ll1);
		System.out.println("**************");
		
		LinkedList ll2=new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add(300);
		System.out.println(ll2);
		ll2.offer(44);
		System.out.println(ll2);
		ll2.offerFirst(54);
		System.out.println(ll2);
	}

}
