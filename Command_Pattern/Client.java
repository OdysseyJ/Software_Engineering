package exercise02.command;

public class Client {
	public static void main(String[] args) {
		TV tv = new TV();
		Command tvPowerCommand = new TVPowerCommand(tv);
		Command tvMuteCommand = new TVMuteCommand(tv);
		Button button1 = new Button(tvPowerCommand);
		Button button2 = new Button(tvMuteCommand);
		TwoButtonController control = new TwoButtonController(button1, button2);
		
		control.Button1Press();
		control.Button2Press();
		control.SetButton1Command(tvMuteCommand);
		control.SetButton2Command(tvPowerCommand);
		control.Button1Press();
		control.Button2Press();
	}
}
