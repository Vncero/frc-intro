package frc.robot.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrain.Drivetrain;

public class DriveForward extends CommandBase {
    Drivetrain drivetrain;
    
    public DriveForward(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    @Override
    public void execute() {
        drivetrain.drive(1.0, 0);
    }
}
