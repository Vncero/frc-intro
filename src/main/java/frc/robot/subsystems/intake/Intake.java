package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

public class Intake extends SubsystemBase {

    private CANSparkMax left;
    private CANSparkMax right;

    private RelativeEncoder leftEncoder;
    private RelativeEncoder rightEncoder;

    public Intake () {
        this.left = new CANSparkMax(Constants.Intake.kPort1, CANSparkMax.MotorType.kBrushless);
        this.right = new CANSparkMax(Constants.Intake.kPort2, CANSparkMax.MotorType.kBrushless);
        this.leftEncoder = this.left.getEncoder();
        this.rightEncoder = this.right.getEncoder();
    }

    public void setPower(double power) {
        this.left.set(power);
        this.right.set(power);
    }

    public void stop() {
        this.setPower(0);
    }
}
