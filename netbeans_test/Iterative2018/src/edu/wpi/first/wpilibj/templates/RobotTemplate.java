/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {
    final int LEFT_MOTOR_PORT  = 0;
    final int RIGHT_MOTOR_PORT = 1;
    
    // simple control scheme
    RobotDrive robot_drive = null;
    Joystick joystick = null;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // RobotDrive intialization
        robot_drive = new RobotDrive(
                LEFT_MOTOR_PORT, RIGHT_MOTOR_PORT);

        joystick = new Joystick(1);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        robot_drive.arcadeDrive(joystick);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        
    }
    
}
