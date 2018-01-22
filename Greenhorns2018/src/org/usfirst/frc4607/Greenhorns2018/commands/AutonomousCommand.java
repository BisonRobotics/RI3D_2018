package org.usfirst.frc4607.Greenhorns2018.commands;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4607.Greenhorns2018.Robot;
import org.usfirst.frc4607.Greenhorns2018.RobotMap;
import org.usfirst.frc4607.Greenhorns2018.subsystems.Drivetrain;

/**
 *
 */
public class AutonomousCommand extends Command {
	
	private char firstPlate;
	private char secondPlate;
	private char thirdPlate;
	private boolean noAuto = true; //This will be default auto mode for safety reasons ;)
	
    public AutonomousCommand(int selectedMode) {
    	if (selectedMode == 1) {
    		noAuto = false; 
    		firstPlate = 'L';
    	}
    	else if (selectedMode == 2) {
    		noAuto = false; 
    		firstPlate = 'R';
    	}
    	else {
    		noAuto = true;
    	}
    	
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
    	firstPlate = gameData.charAt(0);
    	secondPlate = gameData.charAt(1);
    	thirdPlate = gameData.charAt(2);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if(!noAuto) {
    		isFinished();
    	}
    	
    	else {
    		
    	// Uncomment this to when implemented correctly and as needed
    		
    	//RobotMap.drivetrainDifferentialDrive.arcadeDrive(xSpeed, zRotation);
//		if(firstPlate == 'L')
//		{
//			//Left plate code here
//		} else {
//			//Put right auto code here
//		}
    		
    		
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return noAuto;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
    
    // Methods for rest of program to retrieve your plate locations on the field for other potential automated tasks.
    public char getFirstPlate() {
    	return firstPlate;
    }
    
    public char getSecondPlate() {
    	return secondPlate;
    }
    
    public char getThirdPlate() {
    	return thirdPlate;
    }
}
