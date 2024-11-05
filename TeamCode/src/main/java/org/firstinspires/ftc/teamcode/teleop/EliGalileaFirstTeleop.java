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
    boolean isClosed = true;
    EliGalileaFirstHardwareClass.ArmState armState = EliGalileaFirstHardwareClass.ArmState.LOW;

    @Override
    public void init() {
        gamepad = new ImprovedGamepad(gamepad1, new ElapsedTime(), "Gamepad");
        robot.init(this.hardwareMap);
    }

    @Override
    public void loop() {
        gamepad.update();

        robot.leftMove.setPower(gamepad.left_stick_y.getValue());
        robot.rightMove.setPower(-gamepad.right_stick_y.getValue());

        if(isClosed == true){
            if (gamepad.b.isInitialPress()) {
                isClosed = false;
                robot.claw.setPosition(EliGalileaFirstHardwareClass.CLAW_OPEN_POSITION);
            }
        } else {

            if (gamepad.b.isInitialPress()) {
                robot.claw.setPosition(EliGalileaFirstHardwareClass.CLAW_CLOSED_POSITION);
                isClosed = true;
            }
        }

        if (armState == EliGalileaFirstHardwareClass.ArmState.LOW) {
            if (robot.potentiometer.getVoltage() > 3.061) {
                robot.arm.setPower(0.5);
            } else {
                robot.arm.setPower(0);
            }
        }


        // low pos at 3.261
        // mid pos at 2.133
        // high pos at 1.29

//        robot.leftMove.setPower(gamepad.left_stick_y.getValue());
//        robot.rightMove.setPower(gamepad.right_stick_y.getValue());
//
//        telemetry.addData("left stick y", gamepad.left_stick_y.getValue());
//        telemetry.addData("right stick y", gamepad.right_stick_y.getValue());
//
//        if(gamepad.dpad_up.getValue() == true){
//            robot.rightMove.setPower(0.5);
//            robot.leftMove.setPower(0.5);
//
//        } else {
//            robot.rightMove.setPower(0);
//            robot.leftMove.setPower(0);
//        }
//
//        if(gamepad.dpad_down.getValue()){
//            robot.rightMove.setPower(-0.5);
//            robot.leftMove.setPower(-0.5);
//        } else {
//            robot.rightMove.setPower(0);
//            robot.leftMove.setPower(0);
//        }
    }
}
