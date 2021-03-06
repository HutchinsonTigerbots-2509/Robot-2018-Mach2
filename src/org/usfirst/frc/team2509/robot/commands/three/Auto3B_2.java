package org.usfirst.frc.team2509.robot.commands.three;

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
 *We are going to 'B' position from '3'
 */
public class Auto3B_2 extends CommandGroup {

    public Auto3B_2() {
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
    	addSequential(new DriveForward(66));
    	addSequential(new DriveTurn(-90));
    	addSequential(new DriveTurnCorrection(-90));
    	addSequential(new DriveForward(40)); 
    	addSequential(new ArmUp());
    	addSequential(new DriveTurn(90));
    	addSequential(new DriveTurnCorrection(90));
    	//Drop Box
    	addSequential(new OpenGripper());
    	//
    	addSequential(new driveBackward(15));
    	addSequential(new ArmDown());
    }
}
