package informatica.unipr.it;

public class TurnTVOn implements Command {
	
	// Defining which electronic device I want to use
	ElectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.on();
		
	}

	public void undo() {
		
		theDevice.off();
		
	}
	
}
