package org.usfirst.frc4607.Greenhorns2018.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4607.Greenhorns2018.Robot;
import org.usfirst.frc4607.Greenhorns2018.RobotMap;

/**
 *
 */
public class ClimberDown extends Command {

    public ClimberDown() { 	
        requires(Robot.climber);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if (RobotMap.climberClimber.get() == 0) {
    		RobotMap.climberClimber.set(-1);
    	}
    	else {RobotMap.climberClimber.set(0);
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
