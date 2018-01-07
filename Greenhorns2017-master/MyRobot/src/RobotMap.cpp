// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// C++ from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


#include "RobotMap.h"
#include "LiveWindow/LiveWindow.h"
#include "AHRS.h"
#include "WPILib.h"

/*
 * drive train subsystem
 */
std::shared_ptr<SpeedController> RobotMap::drivetrainFrontLeft;
std::shared_ptr<SpeedController> RobotMap::drivetrainFrontRight;
std::shared_ptr<SpeedController> RobotMap::drivetrainRearRight;
std::shared_ptr<SpeedController> RobotMap::drivetrainRearLeft;
std::shared_ptr<RobotDrive>      RobotMap::drivetrainRobotDrive;
std::shared_ptr<SpeedController> RobotMap::drivetrainStrafe;

/*
 * climber subsystem
 */
std::shared_ptr<SpeedController> RobotMap::climberRightMotor;
std::shared_ptr<SpeedController> RobotMap::climberLeftMotor;
std::shared_ptr<RobotDrive>      RobotMap::climberRobotDrive21;

/*
 * cog collector subsystem
 */
std::shared_ptr<Servo>          RobotMap::cogCollectorLeftServo;
std::shared_ptr<Servo>          RobotMap::cogCollectorRightServo;
std::shared_ptr<DoubleSolenoid> RobotMap::cogCollectorDoubleSolenoid;

/*
 * shooter subsystem
 */
std::shared_ptr<SpeedController> RobotMap::shooterShooterMotor;
std::shared_ptr<Encoder>         RobotMap::shooterQuadratureEncoder;

/*
 * intake mech subsystem
 */
std::shared_ptr<SpeedController> RobotMap::intakeMechIntakeMotor;

/*
 * gyroscope subsystem
 */
std::shared_ptr<ADXRS450_Gyro> RobotMap::gyroscopeADXRS450;
std::shared_ptr<AHRS> 		   RobotMap::gyroscopeNavX;

void RobotMap::init() {
    LiveWindow *lw = LiveWindow::GetInstance();

    drivetrainFrontLeft.reset(new Spark(0));
    lw->AddActuator("Drivetrain", "FrontLeft", std::static_pointer_cast<Spark>(drivetrainFrontLeft));
    
    drivetrainFrontRight.reset(new Spark(1));
    lw->AddActuator("Drivetrain", "FrontRight", std::static_pointer_cast<Spark>(drivetrainFrontRight));
    
    drivetrainRearRight.reset(new Spark(2));
    lw->AddActuator("Drivetrain", "RearRight", std::static_pointer_cast<Spark>(drivetrainRearRight));
    
    drivetrainRearLeft.reset(new Spark(3));
    lw->AddActuator("Drivetrain", "RearLeft", std::static_pointer_cast<Spark>(drivetrainRearLeft));
    
    drivetrainRobotDrive.reset(new RobotDrive(drivetrainFrontLeft, drivetrainRearLeft,
              drivetrainFrontRight, drivetrainRearRight));
    
    drivetrainRobotDrive->SetSafetyEnabled(true);
        drivetrainRobotDrive->SetExpiration(0.1);
        drivetrainRobotDrive->SetSensitivity(0.5);
        drivetrainRobotDrive->SetMaxOutput(1.0);

        drivetrainRobotDrive->SetInvertedMotor(RobotDrive::kFrontRightMotor, true);
        drivetrainRobotDrive->SetInvertedMotor(RobotDrive::kRearRightMotor, true);
    drivetrainStrafe.reset(new VictorSP(4));
    lw->AddActuator("Drivetrain", "Strafe", std::static_pointer_cast<VictorSP>(drivetrainStrafe));
    
    climberRightMotor.reset(new Talon(6));
    lw->AddActuator("Climber", "Right Motor", std::static_pointer_cast<Talon>(climberRightMotor));
    
    climberLeftMotor.reset(new Talon(5));
    lw->AddActuator("Climber", "Left Motor", std::static_pointer_cast<Talon>(climberLeftMotor));
    
    climberRobotDrive21.reset(new RobotDrive(climberLeftMotor, climberRightMotor));
    
    climberRobotDrive21->SetSafetyEnabled(true);
        climberRobotDrive21->SetExpiration(0.1);
        climberRobotDrive21->SetSensitivity(0.5);
        climberRobotDrive21->SetMaxOutput(1.0);

        climberRobotDrive21->SetInvertedMotor(RobotDrive::kRearRightMotor, true);
    cogCollectorLeftServo.reset(new Servo(7));
    lw->AddActuator("Cog Collector", "LeftServo", cogCollectorLeftServo);
    
    cogCollectorRightServo.reset(new Servo(8));
    lw->AddActuator("Cog Collector", "Right Servo", cogCollectorRightServo);
    
    cogCollectorDoubleSolenoid.reset(new DoubleSolenoid(0, 0, 1));
    lw->AddActuator("Cog Collector", "Double Solenoid", cogCollectorDoubleSolenoid);
    
    shooterShooterMotor.reset(new TalonSRX(9));
    lw->AddActuator("Shooter", "ShooterMotor", std::static_pointer_cast<TalonSRX>(shooterShooterMotor));
    
    shooterQuadratureEncoder.reset(new Encoder(0, 1, false, Encoder::k4X));
    lw->AddSensor("Shooter", "Quadrature Encoder ", shooterQuadratureEncoder);
    shooterQuadratureEncoder->SetDistancePerPulse(1.0);
    shooterQuadratureEncoder->SetPIDSourceType(PIDSourceType::kRate);
    intakeMechIntakeMotor.reset(new Talon(10));
    lw->AddActuator("IntakeMech", "IntakeMotor", std::static_pointer_cast<Talon>(intakeMechIntakeMotor));
    
    gyroscopeADXRS450.reset(new ADXRS450_Gyro(SPI::Port::kOnboardCS0));
    gyroscopeNavX.reset( new AHRS(SPI::Port::kMXP));

}