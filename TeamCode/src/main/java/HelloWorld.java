import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class HelloWorld extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData("This","test");
    }
}
