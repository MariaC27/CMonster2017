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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2084.CMonster2017.Robot;
import org.usfirst.frc2084.CMonster2017.RobotMap;
import org.usfirst.frc2084.CMonster2017.PID.DistancePID;
import org.usfirst.frc2084.CMonster2017.PID.HeadingPID;

import com.kauailabs.navx.frc.AHRS;

/**
 *
 */
public class TurnLeft extends Command {
	
	private final DistancePID distancePID = RobotMap.distancePID;
	private final HeadingPID headingPID = RobotMap.headingPID;
	private final AHRS ahrs = RobotMap.ahrs;


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TurnLeft() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	headingPID.ResetPID();
    	headingPID.setAbsoluteTolerance(1.5); 
    	//how many degrees off the headingPID can be - prevents oscillation from the 
    	//robot continuously overshooting and then trying to correct itself
    	Robot.driveBase.EnableDriveBase();
    	ahrs.reset();  //reset the navX
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	headingPID.setSetpoint(30); //the number of degrees you want the headingPID to move
    	Robot.driveBase.DriveAutonomous(); //degrees changed from 30 to 60
    	//moves forward during turn
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	SmartDashboard.putBoolean("OnTargetLeft", headingPID.onTarget());
        return headingPID.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
     
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
