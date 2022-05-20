package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;

public class RunOuttake extends CommandBase {
    private Intake intake;
    private double intakePower;
    
    public RunOuttake(Intake intake, double power) {
        this.intake = intake;
        this.intakePower = power;
        addRequirements(intake);
    }

    @Override
    public void execute() {
        intake.setPower( //trick to find sign of power
            intakePower / Math.abs(intakePower) > 0 ? -intakePower : intakePower 
        );
    }
}
