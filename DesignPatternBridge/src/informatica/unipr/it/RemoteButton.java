package informatica.unipr.it;

//Abstraction

//This is an abstract class that will represent numerous
//ways to work with each device

public abstract class RemoteButton{
	
	// A reference to a generic device using aggregation
	
	//create a new entertainment device called theDevice
	private EntertainmentDevice theDevice;
	
	//implement the constructor which is going to be passed entertainment device
	public RemoteButton(EntertainmentDevice newDevice){
		
		//theDevice (created inside) is going to be equal to newDevice (passed to constructor)
		theDevice = newDevice;
		
	}
	
	public void buttonFivePressed() {
		
		theDevice.buttonFivePressed();
		
	}
	
	public void buttonSixPressed() {
		
		theDevice.buttonSixPressed();
		
	}
	
	public void deviceFeedback(){
		
		theDevice.deviceFeedback();
		
	}
	
	//abstract method which is going to be implemented by concrete remotes
	public abstract void buttonNinePressed();
	
}