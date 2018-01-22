package org.usfirst.frc4607.Greenhorns2018.subsystems;

import org.usfirst.frc4607.Greenhorns2018.RobotMap;
import org.usfirst.frc4607.Greenhorns2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 */
public class Drivetrain extends Subsystem {

    private final SpeedController fL = RobotMap.drivetrainFL;
    private final SpeedController fR = RobotMap.drivetrainFR;
    private final SpeedController rL = RobotMap.drivetrainRL;
    private final SpeedController rr = RobotMap.drivetrainRR;
    private final DifferentialDrive robotDrive = RobotMap.drivetrainDifferentialDrive;

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Driving());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

