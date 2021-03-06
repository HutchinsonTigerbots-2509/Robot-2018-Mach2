package org.usfirst.frc.team2509.robot.commands.one;

import org.usfirst.frc.team2509.robot.commands.ArmDown;
import org.usfirst.frc.team2509.robot.commands.ArmUp;
import org.usfirst.frc.team2509.robot.commands.DriveForward;
import org.usfirst.frc.team2509.robot.commands.DriveTurn;
import org.usfirst.frc.team2509.robot.commands.DriveTurnCorrection;
import org.usfirst.frc.team2509.robot.commands.OpenGripper;
import org.usfirst.frc.team2509.robot.commands.driveBackward;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *1			 C
 *		A |-----| E
 *		  |     |
 *		  |     |
 *2		  |     |
 *		B |-----| F
 *3			 D
 *
 *We are going to the 'E' position from '1'
 */
public class Auto1E_2 extends CommandGroup {

    public Auto1E_2() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	addSequential(new DriveForward(210));
    	addSequential(new DriveTurn(90));
    	addSequential(new DriveTurnCorrection(90));
    	addSequential(new DriveForward(50));
    	addSequential(new ArmUp());
    	addSequential(new DriveTurn(90));
    	addSequential(new DriveTurnCorrection(90));
    	addSequential(new DriveForward(2));
    	//Drop Box
    	addSequential(new OpenGripper());
    	//
    	addSequential(new driveBackward(20));
    	addSequential(new ArmDown());
    	    }
}
