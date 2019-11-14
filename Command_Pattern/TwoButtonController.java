package exercise02.command;

public class TwoButtonController {
	private Button button1;
	private Button button2;
	
	TwoButtonController(Button button1, Button button2){
		this.button1 = button1;
		this.button2 = button2;
	}
	
	void Button1Press() {
		this.button1.pressed();
	}
	
	void Button2Press() {
		this.button2.pressed();
	}
	
	void SetButton1Command(Command command) {
		this.button1.setCommand(command);
	}
	
	void SetButton2Command(Command command) {
		this.button2.setCommand(command);
	}
}
