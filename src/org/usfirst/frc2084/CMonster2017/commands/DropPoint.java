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
import org.usfirst.frc2084.CMonster2017.Robot;
import org.usfirst.frc2084.CMonster2017.RobotMap;
import org.usfirst.frc2084.CMonster2017.PID.DistancePID;
import org.usfirst.frc2084.CMonster2017.PID.HeadingPID;

import com.ctre.CANTalon;

/**
 *
 */
public class DropPoint extends Command {
	
	private final DistancePID distancePID = RobotMap.distancePID;
	private final HeadingPID headingPID = RobotMap.headingPID;
	
	private final CANTalon rightTalon1 = RobotMap.driveBaseRightTalon1;
	private final CANTalon leftTalon1 = RobotMap.driveBaseLeftTalon1;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DropPoint() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	distancePID.enable();  //enable and reset the PIDs
    	headingPID.enable();
    	distancePID.ResetPID();
    	headingPID.ResetPID();
    	
    	leftTalon1.setEncPosition(0); //reset the encoders too - set their position to zero
    	rightTalon1.setEncPosition(0);
    	
    	RobotMap.ahrs.reset();  //reset the navX
    	Robot.driveBase.EnableDriveBase();
    	headingPID.setSetpoint(0);  //reset the headingPID 
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	distancePID.setSetpoint(-2.0);  //telling the robot to move 1.2 feet when this command is run
    	Robot.driveBase.DriveAutonomous();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return distancePID.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
