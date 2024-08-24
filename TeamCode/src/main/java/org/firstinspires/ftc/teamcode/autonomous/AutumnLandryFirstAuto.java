package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Autumn Landry Auto", group = "tutorial")
public class AutumnLandryFirstAuto extends AbstractAutonomous {
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        waitForStart();
        move(3);
        turnLeft(3);
        move(13);
        openClaw();
        move(13);
        closeClaw();
        turnRight(4);
        move(10);
    }
}
