package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Kayla Martin First Auto", group = "Tutorial")
public class KaylaMartinFirstAuto extends AbstractAutonomous {
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();

        for(int i = 0; i < 4; i++){
            move(5);
            turnLeft(3);
        }
        for(int i = 0; i < 4; i++){
            move(5);
            turnRight(3);
        }


    }

}
