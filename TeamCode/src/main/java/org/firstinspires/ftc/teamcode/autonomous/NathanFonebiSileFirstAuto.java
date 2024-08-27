package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Nathan Fonebi-Sile First Auto", group = "Outreach")
public class NathanFonebiSileFirstAuto extends AbstractAutonomous{
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();
        move(8);
        turnLeft(5);
        turnRight(13);
        move(9);
        openClaw();
        closeClaw();
    }
}
