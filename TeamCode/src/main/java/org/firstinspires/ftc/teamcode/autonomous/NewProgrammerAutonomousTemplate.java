package org.firstinspires.ftc.teamcode.autonomous;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


//When you make your class make sure it extends AbstractAutonomous, and to paste the @Autonomous line
@Autonomous(name = "Nick Jerden Example Auto", group = "Outreach")
public class NewProgrammerAutonomousTemplate extends AbstractAutonomous{
    @Override
    public void runOpMode() throws InterruptedException {

        // enable FTC dashboard integration
        this.telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
        telemetry.addLine("Nick Jerden's Example Auto");
        telemetry.update();

        robot.init(this.hardwareMap);
        waitForStart();
        //Place your own code below here
        //The available methods are move(), turnLeft(), turnRight(), openClaw(), closeClaw()

    }
}
