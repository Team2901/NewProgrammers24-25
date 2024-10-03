package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardware.EliGalileaFirstHardwareClass;
import org.firstinspires.ftc.teamcode.hardware.ImprovedGamepad;
import org.firstinspires.ftc.teamcode.hardware.UpdatedClawbotHardware;

@TeleOp(name="EliGalileaFirstTeleop")
public class EliGalileaFirstTeleop extends OpMode {
    EliGalileaFirstHardwareClass robot = new EliGalileaFirstHardwareClass();
    ImprovedGamepad gamepad;

    @Override
    public void init() {
        gamepad = new ImprovedGamepad(gamepad1, new ElapsedTime(), "Gamepad");
        robot.init(this.hardwareMap);
    }

    @Override
    public void loop() {
        gamepad.update();
        robot.leftMove.setPower(gamepad.left_stick_y.getValue());
        robot.rightMove.setPower(gamepad.right_stick_y.getValue());

        telemetry.addData("left stick y", gamepad.left_stick_y.getValue());
        telemetry.addData("right stick y", gamepad.right_stick_y.getValue());

        if(gamepad.dpad_up.getValue() == true){
            robot.rightMove.setPower(0.5);
            robot.leftMove.setPower(0.5);

        } else {
            robot.rightMove.setPower(0);
            robot.leftMove.setPower(0);
        }

        if(gamepad.dpad_down.getValue()){
            robot.rightMove.setPower(-0.5);
            robot.leftMove.setPower(-0.5);
        } else {
            robot.rightMove.setPower(0);
            robot.leftMove.setPower(0);
        }
    }
}
