package exercise04.observer;

public class Client {
	public static void main(String[] args) {
		BatteryConsume battery = new BatteryConsume();
		Observer batteryLevelDisplay = new BatteryLevelDisplay(battery);
		Observer lowBatteryWarning = new LowBatteryWarning(battery);
		
		battery.attach(batteryLevelDisplay);
		battery.attach(lowBatteryWarning);
		
		for (int i = 0; i < 99; i++) {
		battery.consume(1);
		}
	}
}
