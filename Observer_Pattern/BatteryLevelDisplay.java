package exercise04.observer;

public class BatteryLevelDisplay implements Observer {
	private BatteryConsume battery;
	public BatteryLevelDisplay(BatteryConsume battery) {
		this.battery = battery;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		int level = battery.getLevel();
		System.out.println("Level: " + level);
	}

}
