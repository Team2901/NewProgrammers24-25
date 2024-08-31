package org.firstinspires.ftc.teamcode.teleop;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardware.ImprovedGamepad;
import org.firstinspires.ftc.teamcode.hardware.OutreachHardware;

public class OutreachTeleOp extends OpMode {
    public OutreachHardware robot = new OutreachHardware();
    public ImprovedGamepad gamepad;
    @Override
    public void init() {
        robot.init(this.hardwareMap);
        gamepad = new ImprovedGamepad(this.gamepad1, new ElapsedTime(), "gamepad");
        this.telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
    }

    @Override
    public void loop() {
        gamepad.update();
        double leftMotor = gamepad.left_stick_y.getValue();
        double rightMotor = gamepad.left_stick_y.getValue();
        robot.leftDrive.setPower(leftMotor);
        robot.rightDrive.setPower(rightMotor);
        telemetry.addData("leftMotor", leftMotor);
        telemetry.addData("rightMotor", rightMotor);


    }
}
