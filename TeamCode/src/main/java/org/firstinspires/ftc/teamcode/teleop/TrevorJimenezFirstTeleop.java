package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardware.ImprovedGamepad;
import org.firstinspires.ftc.teamcode.hardware.UpdatedClawbotHardware;

@TeleOp(name="Trevor Jimenez First Teleop", group="Outreach")
public class TrevorJimenezFirstTeleop extends OpMode {
    UpdatedClawbotHardware robot = new UpdatedClawbotHardware();
    ImprovedGamepad gamepad;
    boolean clawOpen = true;
    @Override
    public void init() {
        gamepad = new ImprovedGamepad(gamepad1, new ElapsedTime(), "Gamepad");
        robot.init(this.hardwareMap);
    }

    @Override
    public void loop() {


        gamepad.update();
        //write all teleop code below here
        if (gamepad.left_stick_y.getValue() < 0) {
            robot.leftDrive.setPower(gamepad.left_stick_y.getValue() * -1);
            robot.rightDrive.setPower(gamepad.left_stick_y.getValue() * -1);

        }else if (gamepad.left_stick_y.getValue() > 0) {
            robot.leftDrive.setPower(gamepad.left_stick_y.getValue() * -1);
            robot.rightDrive.setPower(gamepad.left_stick_y.getValue() * -1);

        }else if (gamepad.left_stick_x.getValue() < 0) {
            robot.rightDrive.setPower(gamepad.right_stick_x.getValue() * -1);
            robot.leftDrive.setPower(gamepad.right_stick_x.getValue());
        }else if (gamepad.left_stick_x.getValue() > 0) {
            robot.leftDrive.setPower(gamepad.right_stick_x.getValue() * -1);
            robot.rightDrive.setPower(gamepad.right_stick_x.getValue());
        }else{
            robot.leftDrive.setPower(0);
            robot.rightDrive.setPower(0);
        }
        if (gamepad.b.isPressed()) {
            if (clawOpen == true){
                robot.claw.setPosition(0.0);
                clawOpen = false;
            }else if (clawOpen == false){
                robot.claw.setPosition(0.75);
                clawOpen = true;
            }
        }
    }
}
