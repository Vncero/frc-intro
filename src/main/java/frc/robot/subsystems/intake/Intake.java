package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class Intake extends SubsystemBase {

    private CANSparkMax left;
    private CANSparkMax right;

    public Intake (int kPort1, int kPort2) {
        this.left = new CANSparkMax(kPort1, CANSparkMax.MotorType.kBrushless);
        this.right = new CANSparkMax(kPort2, CANSparkMax.MotorType.kBrushless);
    }

    public void setPower(double power) {
        this.left.setPower(power);
        this.right.setPower(power);
    }

    public void stop() {
        this.setPower(0);
    }
}
