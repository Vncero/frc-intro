package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.drivetrain.Drivetrain;

public class StandardAuto extends SequentialCommandGroup {
    // put subsystem definitions here
    Drivetrain drivetrain;

    public StandardAuto(/*  put subsystems arguments here  */){

        addCommands(
            new ParallelRaceGroup(
                new DriveForward(drivetrain),
                new WaitCommand(2)
            ),

            new TurnAngle(drivetrain, -90),

            new ParallelRaceGroup(
                new DriveForward(drivetrain),
                new WaitCommand(2)
            ),

            new TurnAngle(drivetrain, -90),

                new ParallelRaceGroup(
                    new DriveForward(drivetrain),
                    new WaitCommand(2)
                )
            );

        addRequirements(drivetrain);

    }

    /*  runs once the command has finished/been interrupted  */
    @Override
    public void end(boolean interrupted){
        
    }
}
