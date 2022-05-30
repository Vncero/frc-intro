package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.drivetrain.Drivetrain;
import frc.robot.subsystems.drivetrain.commands.DriveForward;
import frc.robot.subsystems.drivetrain.commands.TurnAngle;

public class StandardAuto extends SequentialCommandGroup {
    // put subsystem definitions here
    Drivetrain drivetrain;

    public StandardAuto(Drivetrain drivetrain){

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

            new TurnAngle(drivetrain, -180),

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
