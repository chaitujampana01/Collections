import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(100);
		l.add("School");
		l.add(4500);
		System.out.println(l);
		l.add("tshapeskill");
		
		ArrayList al1=new ArrayList();
		al1.add(12);
		al1.add(23);
		al1.add(34);
		System.out.println(al1);
		

		ArrayList al2=new ArrayList();
		al2.add("jai");
		al2.add("kris");
		al2.add("jak");
		System.out.println(al2);
		al2.add(1, "vijay");
		al2.addAll(al1);
		al2.addAll(1,l);
		System.out.println(al2);
		

	}

}
