package org.usfirst.frc4607.Greenhorns2018.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4607.Greenhorns2018.Robot;
import org.usfirst.frc4607.Greenhorns2018.RobotMap;

/**
 *
 */
public class ElevatorUp extends Command {

    public ElevatorUp() {
        requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if (RobotMap.elevatorElevator.get() == 0) {
    		RobotMap.elevatorElevator.set(.7);
    	}
    	else {
    		RobotMap.elevatorElevator.set(0);
    	}    	
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	// return (RobotMap.upperBoundSwitch.get() || true);
    	return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	//RobotMap.elevatorElevator.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
