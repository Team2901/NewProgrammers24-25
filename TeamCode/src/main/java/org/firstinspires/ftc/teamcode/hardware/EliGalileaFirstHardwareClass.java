package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class EliGalileaFirstHardwareClass {

    public DcMotorEx leftMove;

    public DcMotorEx rightMove;

    public DcMotorEx arm;

    public Servo claw;

    public enum ArmState {
        HIGH,
        MID,
        LOW
    }

    public static final double CLAW_OPEN_POSITION = 0.2;
    public static final double CLAW_CLOSED_POSITION = 0.48;
    public AnalogInput potentiometer;

    public void init(HardwareMap hardwareMap) {
        leftMove = hardwareMap.get(DcMotorEx.class, "leftDrive");
        rightMove = hardwareMap.get(DcMotorEx.class, "rightDrive");
        claw = hardwareMap.servo.get("claw");
        claw.setPosition(CLAW_CLOSED_POSITION);
        arm = hardwareMap.get(DcMotorEx.class, "arm");
        potentiometer = hardwareMap.analogInput.get("potentiometer");
    }




}
