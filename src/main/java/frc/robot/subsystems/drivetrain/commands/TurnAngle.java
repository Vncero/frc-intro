package frc.robot.subsystems.drivetrain.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrain.Drivetrain;

public class TurnAngle extends CommandBase {
    Drivetrain drivetrain;
    double  heading;
    double target;

    public TurnAngle(Drivetrain drivetrain, double angle) {
        this.drivetrain = drivetrain;
        target = angle;
        addRequirements(drivetrain);
    }

    @Override
    public void execute() {
        heading = drivetrain.getRotation2d().getDegrees();
        //probably better with a pid, no idea how heading and the drivetrain works
        drivetrain.drive(0, heading > target ? -1.0 : 
        heading < target ? 1.0 : 0);
    }

    @Override
    public boolean isFinished() {
        return heading == target;
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.drive(0, 0);
    }
}
