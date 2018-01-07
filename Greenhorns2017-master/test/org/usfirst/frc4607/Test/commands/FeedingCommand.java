package org.usfirst.frc4607.Test.commands;

import org.usfirst.frc4607.Test.Robot;
import org.usfirst.frc4607.Test.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FeedingCommand extends Command {
	double speed;
    public FeedingCommand(double speed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    /*	if(timeSinceInitialized()%.75 <= .25) Robot.shooter.startFeeding = true;
    	else Robot.shooter.startFeeding = false;
    	if(RobotMap.shooterShooterFeed.get() == 0){*/
    		RobotMap.shooterShooterFeed.set(speed);
    	/*}
    	else{
    		RobotMap.shooterShooterFeed.set(0);
    	}*/
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
