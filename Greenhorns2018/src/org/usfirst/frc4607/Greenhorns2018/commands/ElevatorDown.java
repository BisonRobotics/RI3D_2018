package org.usfirst.frc4607.Greenhorns2018.commands;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4607.Greenhorns2018.Robot;
import org.usfirst.frc4607.Greenhorns2018.RobotMap;

/**
 *
 */
public class ElevatorDown extends Command {

	private PowerDistributionPanel pdPanel = new PowerDistributionPanel();
	private double elevatorCurrent;
	
    public ElevatorDown() {
        requires(Robot.elevator);
        //requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	elevatorCurrent = pdPanel.getCurrent(0);
    	
    	if (RobotMap.elevatorElevator.get() == 0) { // && elevatorCurrent <= 5
    		RobotMap.elevatorElevator.set(-.4);
    	}
    	else {
    		RobotMap.elevatorElevator.set(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	return true;
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
}
