package org.firstinspires.ftc.teamcode.autonomous;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "Hello World!", group = "Tutorials")
public class HelloWorld  extends AbstractAutonomous{
    @Override
    public void runOpMode() throws InterruptedException {

        // enable FTC dashboard integration
        this.telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        // Write a message out to the drive station
        telemetry.addLine("Hello World !");
        telemetry.update();

        waitForStart();
        telemetry.addLine("My name is Autumn");
        telemetry.update();

        // wait for end of autonomous
        while(opModeIsActive()) {
            idle();
        }
    }
}
