package frc.robot.subsystems.turret;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class Turret extends SubsystemBase {
    private CANSparkMax angleMotor;
    private CANSparkMax speedMotor;

    private SparkMaxPIDController anglePID;
    private SparkMaxPIDController speedPID;

    private RelativeEncoder angleEncoder;
    private RelativeEncoder speedEncoder;
    
    public Turret () {
        this.angleMotor = new CANSparkMax(Constants.Turret.kPort1, CANSparkMax.MotorType.kBrushless);
        this.speedMotor = new CANSparkMax(Constants.Turret.kPort2, CANSparkMax.MotorType.kBrushless);

        this.anglePID = this.angleMotor.getPIDController();
        this.speedPID = this.speedMotor.getPIDController();

        this.angleEncoder = this.angleMotor.getEncoder();
        this.speedEncoder = this.speedMotor.getEncoder();

        this.angleEncoder.reset();
        this.speedEncoder.reset();

        this.anglePID.setP(Constants.Turret.kPAngle); this.anglePID.setI(Constants.Turret.kIAngle); this.anglePID.setD(Constants.Turret.kDAngle);
        this.speedPID.setP(Constants.Turret.kPSpeed); this.speedPID.setI(Constants.Turret.kISpeed); this.speedPID.setD(Constants.Turret.kDSpeed);
    }

    @Override
    public void periodic() {
        //turn turret to face hub
        toAngle(90.0d);
    }

    public void toAngle(double angle) {
        //convert angle into tick reading
        if (this.angleEncoder.getDistance() < angle) {
            this.angleMotor.set(0.5);
        }
        //should probably be in some loop 
        //could pair with a WaitCommand() of some kind?
    }

    public void setSpeed(double speed) {
        this.speedMotor.set(speed);
    }

    public void stop() {
        setSpeed(0);
        this.angleMotor.set(0);
    }
}