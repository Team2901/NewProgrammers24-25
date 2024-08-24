package org.firstinspires.ftc.teamcode.autonomous;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "Hello World (OpMode)!", group = "Tutorials")
public class HelloWorldOpmode extends OpMode {
    public ElapsedTime init_timer;
    public ElapsedTime run_timer;

    @Override
    public void init() {
        // enable FTC dashboard integration
        this.telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        // Start the timer
        init_timer = new ElapsedTime();

        // Write a message out to the drive station
        telemetry.addData("Hello World!", "From init()");
    }

    @Override
    public void init_loop() {
        telemetry.addData("Time in init (s)", init_timer.seconds());
    }

    @Override
    public void start() {
        // Create & start the run timer
        run_timer = new ElapsedTime();

        // Update our message
        telemetry.addData("Hello World!", "From start()");
    }

    @Override
    public void loop() {
        telemetry.addData("Time in run (s)", run_timer.seconds());
    }
}
