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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

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
    public static SpeedController climberClimber;
    public static SpeedController drivetrainFL;
    public static SpeedController drivetrainFR;
    public static SpeedController drivetrainRL;
    public static SpeedController drivetrainrr;
    public static RobotDrive drivetrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        elevatorElevator = new Spark(7);
        LiveWindow.addActuator("Elevator", "Elevator", (Spark) elevatorElevator);
        elevatorElevator.setInverted(false);
        intakeIntake = new Spark(6);
        LiveWindow.addActuator("Intake", "Intake", (Spark) intakeIntake);
        intakeIntake.setInverted(false);
        climberClimber = new Spark(5);
        LiveWindow.addActuator("Climber", "Climber", (Spark) climberClimber);
        climberClimber.setInverted(false);
        drivetrainFL = new Spark(0);
        LiveWindow.addActuator("Drivetrain", "FL", (Spark) drivetrainFL);
        drivetrainFL.setInverted(false);
        drivetrainFR = new Spark(1);
        LiveWindow.addActuator("Drivetrain", "FR", (Spark) drivetrainFR);
        drivetrainFR.setInverted(false);
        drivetrainRL = new Spark(2);
        LiveWindow.addActuator("Drivetrain", "RL", (Spark) drivetrainRL);
        drivetrainRL.setInverted(false);
        drivetrainrr = new Spark(4);
        LiveWindow.addActuator("Drivetrain", "rr", (Spark) drivetrainrr);
        drivetrainrr.setInverted(false);
        drivetrainRobotDrive = new RobotDrive(drivetrainFL, drivetrainRL,
              drivetrainFR, drivetrainrr);
        
        drivetrainRobotDrive.setSafetyEnabled(true);
        drivetrainRobotDrive.setExpiration(0.1);
        drivetrainRobotDrive.setSensitivity(0.5);
        drivetrainRobotDrive.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
