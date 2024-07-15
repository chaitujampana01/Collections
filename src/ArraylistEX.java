import java.util.ArrayList;

public class ArraylistEX {
	int id;
	String name;
	int age;

	public ArraylistEX(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "ArraylistEX [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList employeelist=new ArrayList();
		employeelist.add(new ArraylistEX(20,"vijay", 47));
		ArraylistEX e2=new ArraylistEX(2,"rohit",27);
		employeelist.add(e2);
		
	}

}
