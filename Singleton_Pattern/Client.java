package exercise01.singleton;

public class Client {
	public static void main(String[] args) {
		UserThread[] users = new UserThread[10];
		for (int i = 0; i < users.length; i++) {
			users[i] = new UserThread((i+1) + "-thread");
			users[i].start();
		}
	}
}
