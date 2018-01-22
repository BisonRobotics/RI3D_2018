package org.usfirst.frc4607.Greenhorns2018;

import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.hal.PDPJNI;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4607.Greenhorns2018.commands.*;
import org.usfirst.frc4607.Greenhorns2018.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {
	
	private PowerDistributionPanel pdPanel = new PowerDistributionPanel();
	private double elevatorCurrent;
    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();

    public static OI oi;
    public static Elevator elevator;
    public static Intake intake;
    public static Climber climber;
    public static Drivetrain drivetrain;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        elevator = new Elevator();
        intake = new Intake();
        climber = new Climber();
        drivetrain = new Drivetrain();

        oi = new OI();

        // Add commands to Autonomous Sendable Chooser

        chooser.addDefault("Default: No Auto :(", new AutonomousCommand(3));
        chooser.addObject("Left Side", new AutonomousCommand(1));
        chooser.addObject("Right Side", new AutonomousCommand(2));
        SmartDashboard.putData("Auto mode", chooser);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }
    
    @Override
    public void robotPeriodic() {
    	//Some handy values here!
    	elevatorCurrent = pdPanel.getCurrent(0);
        SmartDashboard.putNumber("PDP Total Current Draw:", pdPanel.getTotalCurrent());
        SmartDashboard.putNumber("PDP Total Energy:", pdPanel.getTotalEnergy());
        SmartDashboard.putNumber("PDP Voltage:", pdPanel.getVoltage());
        SmartDashboard.putNumber("PDP Temperature:", pdPanel.getTemperature());
        SmartDashboard.putNumber("REV Blinkin Current Draw:", pdPanel.getCurrent(8));
        SmartDashboard.putNumber("Elevator Current Draw:", elevatorCurrent);
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
