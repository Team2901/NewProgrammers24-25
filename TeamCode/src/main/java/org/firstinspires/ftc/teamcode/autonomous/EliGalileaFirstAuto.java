package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Eli Galilea Example Auto", group = "Outreach")
public class EliGalileaFirstAuto extends AbstractAutonomous{
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();
        move(4);
        turnLeft(3);
        move(2);
        turnRight(3);
        openClaw();
        move(4);
        closeClaw();
    }
}
