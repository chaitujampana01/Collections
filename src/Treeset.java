import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		ts.add(75);
		System.out.println(ts);
		System.out.println(ts.ceiling(85));
		System.out.println(ts.higher(85));

	}

}
