
public class BoxUnbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(10);
		System.out.println(i);
		Integer i2=Integer.valueOf(20);
		int n1=10;
		Integer n2=Integer.valueOf(i2);//Boxing
		Integer n3=n1;//AutoBoxing
		
		Integer n4=Integer.valueOf(4);
		int n5=n4.intValue(); //Unboxing
		int n6=n5;//Autounboxing
		

	}

}
