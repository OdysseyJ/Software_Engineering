package exercise02.command;

public class TVMuteCommand implements Command {
	private TV theTV;
	public TVMuteCommand(TV theTV) {
		this.theTV = theTV;
	}
	public void execute() {
		theTV.mute();
	}
}
