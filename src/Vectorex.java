import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Vectorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(50);
		v.add(100);
		v.add(150);
		v.add(44);
		System.out.println(v);
		
		Iterator itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		

	}

}
