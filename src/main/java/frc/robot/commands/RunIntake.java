package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunIntake extends CommandBase {
    
    private Intake intake;
    private double intakePower;

    public RunIntake(Intake intake, double power) {
        this.intake = intake;
        this.intakePower = power;
        addRequirements(intake);
    }

    @Override
    public void execute() {
        intake.setPower(
            intakePower / Math.abs(intakePower) > 0 ? intakePower : -intakePower
        );
    }
}
