// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2084.CMonster2017.subsystems;

import org.usfirst.frc2084.CMonster2017.RobotMap;
import org.usfirst.frc2084.CMonster2017.commands.*;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ClimberBase extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DoubleSolenoid climberSolenoid = RobotMap.climberBaseclimberSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public static CANTalon climberTalon = RobotMap.driveBaseClimberTalon;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void beginClimber(){
		climberTalon.set(-1);
		//set the talon to a speed
	}
	
	public void stopClimber(){
		climberTalon.set(0);
		//when climber is stopped, talon is set to zero (no movement)
	}
	
	public void beginUnwindClimber(){
		climberTalon.set(1);
	}
	
	public void stopUnwindClimber(){
		climberTalon.set(0);
	}
	
	public void startClimberPiston(){
		climberSolenoid.set(DoubleSolenoid.Value.kForward);
		//method that extends the climber piston, called into the button commands
	}
	
	public void stopClimberPiston(){
		climberSolenoid.set(DoubleSolenoid.Value.kReverse);
		//method that retracts the climber piston, called into the button commands
	}
	


    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
 

        // Set the default command for a subsystem here.
    	
        // setDefaultCommand(new MySpecialCommand());
    }
}

