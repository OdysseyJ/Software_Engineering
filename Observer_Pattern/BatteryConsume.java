package exercise04.observer;

public class BatteryConsume extends Battery {
	private int level = 100;
	public void consume(int amount) {
		level -= amount;
		notifyObservers();
	}
	public int getLevel() {return level;}
}
