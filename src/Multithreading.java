
public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Application started...");
		
		//Thread.sleep(5000);
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		thread.setName("notmain");
		thread.setPriority(1);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println("Application Terminated");
	}

}
