package frc.robot.subsystems.turret;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class Turret extends SubsystemBase {
    private CANSparkMax angleMotor;
    private CANSparkMax speedMotor;

    private SparkMaxPIDController anglePID;
    private SparkMaxPIDController speedPID;
    
    public Turret () {
        this.angleMotor = new CANSparkMax(Constants.Turret.kPort1, CANSparkMax.MotorType.kBrushless);
        this.speedMotor = new CANSparkMax(Constants.Turret.kPort2, CANSparkMax.MotorType.kBrushless);

        this.anglePID = this.angleMotor.getPIDController();
        this.speedPID = this.speedMotor.getPIDController();

        this.anglePID.setP(Constants.Turret.kPAngle); this.anglePID.setI(Constants.Turret.kIAngle); this.anglePID.setD(Constants.Turret.kDAngle);
        this.speedPID.setP(Constants.Turret.kPSpeed); this.speedPID.setI(Constants.Turret.kISpeed); this.speedPID.setD(Constants.Turret.kDSpeed);
    }
}
