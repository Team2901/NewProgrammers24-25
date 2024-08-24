package org.firstinspires.ftc.teamcode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.hardware.UpdatedClawbotHardware;

@Autonomous(name="MiloMikaFirstAuto", group = "Tutorial")
public class MiloMikaFirstAuto extends AbstractAutonomous {

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(this.hardwareMap);
        waitForStart();

        for(int i = 0; i < 4; i++){
            move(2);
            turnLeft(2);
        }

        for(int i = 0; i < 4; i++){
            timer.reset();
            while(timer.seconds() < 1){
                idle();

            }
            if(robot.claw.getPosition() == UpdatedClawbotHardware.CLAW_OPEN_POSITION){
                closeClaw();
            }else{
                openClaw();
            }
        }




    }

}
