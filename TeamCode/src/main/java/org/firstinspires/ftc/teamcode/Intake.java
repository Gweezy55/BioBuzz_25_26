package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {


    public DcMotor IntakeMotor;

    public void init(HardwareMap hwMap)
    {
        IntakeMotor = hwMap.get(DcMotor.class, "IntakeMotor");
        IntakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        IntakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        this.stop();
    }

    public void intakeSpeed(double power) {
        IntakeMotor.setPower(power);
    }

    public void stop() {
        double stopPower = 0.0;
        IntakeMotor.setPower(stopPower);
    }
}

