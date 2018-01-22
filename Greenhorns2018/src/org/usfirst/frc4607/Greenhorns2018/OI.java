package org.usfirst.frc4607.Greenhorns2018;

import org.usfirst.frc4607.Greenhorns2018.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4607.Greenhorns2018.subsystems.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public JoystickButton intakeInButton;
    public JoystickButton intakeOutButton;
    public JoystickButton cLimberUpButton;
    public JoystickButton climberDownButton;
    public JoystickButton elevatorUpButton;
    public JoystickButton elevatorDownButton;
    public Joystick driver;
    public Joystick driver2; // for tank driving
    public Joystick operator; // for manipulator functions of bot


    public OI() {
    	// There are two joysticks for using tank drive if desired. Command control buttons are on the driver joystick.
        driver = new Joystick(0);
        operator = new Joystick(1);
        driver2 = new Joystick(2);
        
        // Set up buttons and assign commands to them
        elevatorDownButton = new JoystickButton(operator, 4);
        elevatorDownButton.whenPressed(new ElevatorDown());
        elevatorUpButton = new JoystickButton(operator, 6);
        elevatorUpButton.whenPressed(new ElevatorUp());
        climberDownButton = new JoystickButton(operator, 3);
        climberDownButton.whenPressed(new ClimberDown());
        cLimberUpButton = new JoystickButton(operator, 5);
        cLimberUpButton.whenPressed(new ClimberUp());
        intakeOutButton = new JoystickButton(driver, 2);
        intakeOutButton.whenPressed(new IntakeOut());
        intakeInButton = new JoystickButton(driver, 1);
        intakeInButton.whenPressed(new IntakeIn());

    public Joystick getDriverRight() {
        return driver;
    }
    
    public Joystick getDriverLeft() {
        return driver2;
    }
    
    public Joystick getOperator() {
    	return operator;
    }

}

