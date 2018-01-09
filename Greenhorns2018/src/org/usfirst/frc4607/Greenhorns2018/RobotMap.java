// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4607.Greenhorns2018;

import edu.wpi.first.wpilibj.DigitalInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController elevatorElevator;
    public static SpeedController intakeIntake;
    public static SpeedController intakeIntake2;
    public static SpeedController climberClimber;
    public static SpeedController drivetrainFL;
    public static SpeedController drivetrainFR;
    public static SpeedController drivetrainRL;
    public static SpeedController drivetrainRR;
    public static DifferentialDrive drivetrainDifferentialDrive;
    public static DigitalInput lowerBoundSwitch;
    public static DigitalInput upperBoundSwitch;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // Set up all devices, including motor controllers and limit switches for drivetrain and manipulators
        elevatorElevator = new Spark(6);
        ((Spark) elevatorElevator).setName("Elevator","Elevator");
        elevatorElevator.setInverted(true);
        intakeIntake = new Spark(0);
        ((Spark) intakeIntake).setName("Intake","Intake");
        intakeIntake.setInverted(true);      
        intakeIntake2 = new Spark(9);
        ((Spark) intakeIntake2).setName("Intake","Intake2");
        intakeIntake2.setInverted(false);
        climberClimber = new Spark(3);
        ((Spark) climberClimber).setName("Climber","Climber");
        climberClimber.setInverted(true);
        drivetrainFL = new Spark(1);
        ((Spark) drivetrainFL).setName("Drivetrain","FL");
        drivetrainFL.setInverted(true);
        drivetrainFR = new Spark(7);
        ((Spark) drivetrainFR).setName("Drivetrain","FR");
        drivetrainFR.setInverted(true);
        drivetrainRL = new Spark(2);
        ((Spark) drivetrainRL).setName("Drivetrain","RL");
        drivetrainRL.setInverted(true);
        drivetrainRR = new Spark(8);
        ((Spark) drivetrainRR).setName("Drivetrain","RR");
        drivetrainRR.setInverted(true);
        lowerBoundSwitch = new DigitalInput(0);
        lowerBoundSwitch.setName("Elevator", "Lower Bound Limit Switch");
        upperBoundSwitch = new DigitalInput(1);
        upperBoundSwitch.setName("Elevator", "Upper Bound Limit Switch");
        SpeedControllerGroup m_left = new SpeedControllerGroup(drivetrainFL, drivetrainRL);
        SpeedControllerGroup m_right = new SpeedControllerGroup(drivetrainFR, drivetrainRR);        
        drivetrainDifferentialDrive = new DifferentialDrive(m_left, m_right);        
        drivetrainDifferentialDrive.setSafetyEnabled(true);
        drivetrainDifferentialDrive.setExpiration(0.1);
        drivetrainDifferentialDrive.setMaxOutput(1.0);
        drivetrainDifferentialDrive.setDeadband(.02);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}