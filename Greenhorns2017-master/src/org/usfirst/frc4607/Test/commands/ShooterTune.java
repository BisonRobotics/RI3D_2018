package org.usfirst.frc4607.Test.commands;

import org.usfirst.frc4607.Test.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ShooterTune extends Command {

    public ShooterTune() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double tuningValue = (-1*Robot.oi.getCopilot().getRawAxis(3)+1)/-2;
    	Robot.shooter.Tuning(tuningValue);
    	SmartDashboard.putNumber("Slider", tuningValue);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
