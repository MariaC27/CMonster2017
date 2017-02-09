// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2084.CMonster2017.commands;
import edu.wpi.first.wpilibj.command.Command;
<<<<<<< HEAD:src/org/usfirst/frc2084/CMonster2017/commands/MoveForward.java
import edu.wpi.first.wpilibj.command.Scheduler;
=======
>>>>>>> 6011140ae92ef4423b2a20ed31e77178eb71dd90:src/org/usfirst/frc2084/CMonster2017/commands/MoveForward.java
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2084.CMonster2017.Robot;
import org.usfirst.frc2084.CMonster2017.RobotMap;
import org.usfirst.frc2084.CMonster2017.PID.DistancePID;
import org.usfirst.frc2084.CMonster2017.PID.HeadingPID;

import edu.wpi.first.wpilibj.Encoder;

/**
 *
 */
public class MoveForward extends Command {
	
	private final DistancePID distancePID = RobotMap.distancePID;
	private final HeadingPID headingPID = RobotMap.headingPID;
<<<<<<< HEAD:src/org/usfirst/frc2084/CMonster2017/commands/MoveForward.java
	//private final Encoder leftEncoder = RobotMap.driveBaseLeftEncoder;
	//private final Encoder rightEncoder = RobotMap.driveBaseRightEncoder;
=======
	private final Encoder leftEncoder = RobotMap.driveBaseLeftEncoder;
	private final Encoder rightEncoder = RobotMap.driveBaseRightEncoder;
>>>>>>> 6011140ae92ef4423b2a20ed31e77178eb71dd90:src/org/usfirst/frc2084/CMonster2017/commands/MoveForward.java

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public MoveForward() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	distancePID.enable();
    	headingPID.enable();
    	//distancePID.Reset();
    	//headingPID.Reset();
<<<<<<< HEAD:src/org/usfirst/frc2084/CMonster2017/commands/MoveForward.java
    	RobotMap.ahrs.reset();
    	Robot.driveBase.EnableDriveBase();
    	headingPID.setSetpoint(0);
=======
    	leftEncoder.reset();
    	rightEncoder.reset();
    	RobotMap.ahrs.reset();
    	Robot.driveBase.EnableDriveBase();
    	headingPID.setSetpoint(0);
    
>>>>>>> 6011140ae92ef4423b2a20ed31e77178eb71dd90:src/org/usfirst/frc2084/CMonster2017/commands/MoveForward.java
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	distancePID.setSetpoint(2);
    	Robot.driveBase.DriveAutonomous();
    	SmartDashboard.putNumber("NAVX Yaw", (double)RobotMap.ahrs.getYaw());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return distancePID.onTarget();
        
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Scheduler.getInstance().removeAll(); // resets distances for the next
		//autonomous command, so values don't carry over through different autos
 
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
