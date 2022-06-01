package frc.robot.subsystems.turret.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.turret.Turret;

public class ShootLowGoal extends CommandBase {
    private Turret turret;
    
    public ShootLowGoal(Turret turret) {
        this.turret = turret;

        addRequirements(turret);
    }

    @Override
    public void execute() {
        /* 
            not sure if turret's angleMotor controls 
            the hood or the orientation of the turret itself  
        */ 
        turret.toAngle(Constants.Turret.kLowGoalAngle);

        turret.setSpeed(0.5);
    }

    @Override
    public boolean isFinished() {
        return false;
        //should return if there's no ball detected in the shooter 
    }

    @Override
    public void end(boolean interrupted) {
        turret.stop();
    }
}