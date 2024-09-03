package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Adam Do First Auto", group="tutorial")
public class AdamDoFirstAuto extends AbstractAutonomous{
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();
        move();
        turnLeft();
        turnLeft(2);
        turnRight();
        
    }

}
