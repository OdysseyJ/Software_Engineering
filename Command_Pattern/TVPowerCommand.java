package exercise02.command;

public class TVPowerCommand implements Command {
	private TV theTV;
	public TVPowerCommand(TV theTV) {
		this.theTV = theTV;
	}
	public void execute() {
		theTV.power();
	}
}
