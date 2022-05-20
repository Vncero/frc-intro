package frc.robot.commands;

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
        intake.setPower(
            intakePower / Math.abs(intakePower) > 0 ? -intakePower : intakePower 
        );
    }
}
