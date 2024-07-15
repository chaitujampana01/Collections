class Bathroom implements Runnable{
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "has entered the Bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + "has used the bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+ "has exited the bathroom");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Multithread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bathroom b=new Bathroom();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("Tiktoker");
		
		t1.setPriority(5);
		t2.setPriority(4);
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
				

	}

}
