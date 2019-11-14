package exercise01.singleton;

public class TicketMaker {
	private static int ticket = 1000;
	
	// 쓰레드가 접근하는 순서는 JVM이 운영체제에게 위임해서 운영체제가 결정한다.
	public synchronized static int getNextTicketNumber() {
		return ticket++;
	}
}