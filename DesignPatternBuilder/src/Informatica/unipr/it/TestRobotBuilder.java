package Informatica.unipr.it;

public class TestRobotBuilder {
	
	public static void main(String[] args){
		
		// Get a RobotBuilder of type OldRobotBuilder (define a RobotBuilder)
		// define a sort of blueprint
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		// Pass the OldRobotBuilder specification to the engineer
		// for doing that I have to create an engineer and pass him the blueprint
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		//the engineer will make the robot using the blueprint
		robotEngineer.makeRobot();
		
		// The engineer returns the right robot based off of the specifications
		// sent to it on line 11
		// Call getRobot from the engineer to define the actual robot
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
		
	}
	
}
