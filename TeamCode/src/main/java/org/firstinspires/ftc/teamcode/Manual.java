package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

//import org.firstinspires.ftc.teamcode.PrisimColor.PrismColor;


@TeleOp(name = "Manual")
public class Manual extends OpMode {
    public Mecanum mecanum = new Mecanum();
 //   public Yeeter yeeter = new Yeeter();
  //  public AprilTag_9968 aTag = new AprilTag_9968();
 //   public PrisimColor led = new PrisimColor();
    public Intake intake = new Intake();
    public ElapsedTime timer = new ElapsedTime(ElapsedTime.Resolution.SECONDS);

    double kp = 0.05;
    double ki = 0.0005;
    double kd = 0;
    double maxIntegralSum = 30.0;
    double desiredBearingAngle = 0.0;
    double bearingAngle = 0.0;
    double bearingMotorPower = 0.0;
    double bearingDeadband = 0.3;
    double bearingErrorRunningSum = 0.0;
    double previousBearingError = 0.0;
    //double aprilYeet = ;
    boolean firstLoopDone = false;


    public void init() {
        mecanum.init(hardwareMap);
     //   aTag.init(hardwareMap);
     //   yeeter.init(hardwareMap);
      //  led.init(hardwareMap);
     //   aTag.startStreaming();
        intake.init(hardwareMap);
    }


    @Override
    public void loop() {
        mecanum.manualDrive(gamepad1, telemetry);

        if(gamepad1.a){
            intake.intakeSpeed(0.5);
        }

        telemetry.addData("Bearing Angle: ", bearingAngle);
        telemetry.addData("Timer: ", timer);
        telemetry.update();
    }



}