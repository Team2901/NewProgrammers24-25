package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Connor Licht Auto", group = "Tutorial")
public class ConnorLicht extends AbstractAutonomous {
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();

        move(8);
        turnLeft(4);
        openClaw();
        turnRight(3);
        closeClaw();
        turnLeft(1);
        move(7);

    }
}
