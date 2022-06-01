package frc.robot;

public class Constants {
    public static final class Trajectory {
        public static final double kDistPerRot = 3.072 / 100;
    }

    public static final class Drivetrain {
        public static final double kThrottleFilter = 1.5;
        public static final double kTurnFilter = 1.5;
    }

    public static final class Intake {
        public static final int kPort1 = 0;
        public static final int kPort2 = 1;
    }

    public static final class Turret {
        public static final int kPort1 = 3;
        public static final int kPort2 = 4;

        public static final double kPAngle = 5.1;
        public static final double kIAngle = 1.2;
        public static final double kDAngle = 3.4;
        
        public static final double kPSpeed = 5.9;
        public static final double kISpeed = 2.1;
        public static final double kDSpeed = 2.8;

        public static final double kHighGoalAngle = 75.0;
        public static final double kLowGoalAngle = 45.0;
    }
}
