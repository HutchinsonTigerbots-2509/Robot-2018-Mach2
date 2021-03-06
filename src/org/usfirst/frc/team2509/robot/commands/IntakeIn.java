package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.Robot;
import org.usfirst.frc.team2509.robot.subsystems.Gripper;
import org.usfirst.frc.team2509.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *Takes the box in so we can grab it with our gripper
 */
public class IntakeIn extends Command {
	private Intake intake = Robot.intake;
	private Gripper grip = Robot.gripper;
    public IntakeIn() {
    	requires(Robot.intake);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	grip.close();
    	intake.extend();
    	intake.on();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	intake.on();
//    	Timer.delay(0.1);
//    	intake.off();
//    	Timer.delay(0.075);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	intake.retract();
    	intake.off();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
