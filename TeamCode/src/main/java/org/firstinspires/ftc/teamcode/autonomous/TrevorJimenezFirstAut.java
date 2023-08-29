package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Trevor Jimenez First Auto", group = "Outreach")
public class TrevorJimenezFirstAut extends AbstractAutonomous{
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();
        int x = 0;
        while (x<6) {
            move(1);
            turnRight(1);
            x = x +1;
        }
    }
}
