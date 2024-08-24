package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardware.ImprovedGamepad;
import org.firstinspires.ftc.teamcode.hardware.UpdatedClawbotHardware;

@TeleOp(name="Example Teleop (Tank Drive)", group="Tutorial")
public class ExampleTeleop extends OpMode {
    UpdatedClawbotHardware robot = new UpdatedClawbotHardware();
    ImprovedGamepad gamepad;

    @Override
    public void init() {
        gamepad = new ImprovedGamepad(gamepad1, new ElapsedTime(), "Gamepad");
        robot.init(this.hardwareMap);
    }

    @Override
    public void loop() {
        gamepad.update();
        robot.leftDrive.setPower(gamepad.left_stick_y.getValue());
        robot.rightDrive.setPower(gamepad.right_stick_y.getValue());

        telemetry.addData("left stick y", gamepad.left_stick_y.getValue());
        telemetry.addData("right stick y", gamepad.right_stick_y.getValue());
    }
}
