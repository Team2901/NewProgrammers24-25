package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "JacobVazquezFirstAuto", group = "Tutorials")
public class JacobVazquezFirstAuto extends AbstractAutonomous{
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();

        move(3);
        turnLeft(2);
        turnRight(2);
    }
}
