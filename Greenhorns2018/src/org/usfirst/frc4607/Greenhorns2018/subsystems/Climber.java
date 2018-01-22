package org.usfirst.frc4607.Greenhorns2018.subsystems;

import org.usfirst.frc4607.Greenhorns2018.RobotMap;
import org.usfirst.frc4607.Greenhorns2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 */
public class Climber extends Subsystem {

    private final SpeedController climber = RobotMap.climberClimber;

    @Override
    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

