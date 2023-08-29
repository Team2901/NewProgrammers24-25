package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardware.ImprovedGamepad;
import org.firstinspires.ftc.teamcode.hardware.UpdatedClawbotHardware;

@TeleOp(name="Olivia McGee First Teleop", group="Outreach")

public class OliviaMcgeeFirstTeleop extends OpMode {
    UpdatedClawbotHardware robot = new UpdatedClawbotHardware();
    ImprovedGamepad gamepad;
    double leftPower = 0;
    double rightPower = 0;

    @Override
    public void init() {
        gamepad = new ImprovedGamepad(gamepad1, new ElapsedTime(), "Gamepad");
        robot.init(this.hardwareMap);
    }

    String clawState = "closed";

    @Override
    public void loop() {
        gamepad.update();
        //write all teleop code below here
        if (clawState == "opened" ) {
            if (gamepad.y.isInitialPress()){
                robot.claw.setPosition(0.0);
                clawState = "closed";
            }

        }
        else if (clawState == "closed"){
            if (gamepad.y.isInitialPress()){
            robot.claw.setPosition(0.75);
            clawState = "opened";
            }
        }
        telemetry.addData("currentState",clawState);






        if (gamepad.dpad_up.isPressed() == true){
            robot.arm.setPower(1);
        }
        if (gamepad.dpad_up.isPressed() == true){
            robot.arm.setPower(-.1);
        }
        leftPower = gamepad.left_stick_y.getValue() * -1;
        robot.leftDrive.setPower(leftPower);
        rightPower = gamepad.right_stick_y.getValue() * -1;
        robot.rightDrive.setPower(rightPower);
    }
}
