package informatica.unipr.it;

// return the type of device where are going to use
public class TVRemote {
	
	public static ElectronicDevice getDevice(){
		
		// we are going to use a television object as our RECEIVER
		return new Television();
		
	}
	
}
