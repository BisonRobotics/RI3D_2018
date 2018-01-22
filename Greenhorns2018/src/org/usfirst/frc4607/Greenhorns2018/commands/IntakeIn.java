package org.usfirst.frc4607.Greenhorns2018.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4607.Greenhorns2018.Robot;
import org.usfirst.frc4607.Greenhorns2018.RobotMap;

/**
 *
 */
public class IntakeIn extends Command {

    public IntakeIn() {
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if (RobotMap.intakeIntake.get() == 0) {
        	RobotMap.intakeIntake.set(.6);
        	RobotMap.intakeIntake2.set(.6);
    	}
    	else {
    		RobotMap.intakeIntake.set(0);
    		RobotMap.intakeIntake2.set(0);
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
