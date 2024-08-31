package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.hardware.OutreachHardware;

public class OutreachTeleOp extends OpMode {
    public OutreachHardware robot = new OutreachHardware();
    @Override
    public void init() {
        robot.init(this.hardwareMap);
    }

    @Override
    public void loop() {

    }
}
