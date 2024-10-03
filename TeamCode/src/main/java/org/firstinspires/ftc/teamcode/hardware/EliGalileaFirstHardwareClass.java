package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class EliGalileaFirstHardwareClass {

    public DcMotorEx leftMove;

    public DcMotorEx rightMove;

    public Servo claw;

    public void init(HardwareMap hardwareMap) {
        leftMove = hardwareMap.get(DcMotorEx.class, "leftDrive");
        rightMove = hardwareMap.get(DcMotorEx.class, "rightDrive");
        claw = hardwareMap.servo.get("claw");
    }




}
