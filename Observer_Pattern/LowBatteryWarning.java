package exercise04.observer;

public class LowBatteryWarning implements Observer {
	private static final int LOW_BATTERY = 30;
	private BatteryConsume battery;
	public LowBatteryWarning(BatteryConsume battery) {
		this.battery = battery;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		int level = battery.getLevel();
		if (level < LOW_BATTERY) {
			System.out.println("<Warining Low Battery : " + level + " Compared with " + LOW_BATTERY);
		}
	}

}
