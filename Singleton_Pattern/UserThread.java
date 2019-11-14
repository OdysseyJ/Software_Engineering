package exercise01.singleton;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is making ticket: " + TicketMaker.getNextTicketNumber());
	}
}
