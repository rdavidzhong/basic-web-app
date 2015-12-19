package tutorial;

/**
 * Created by codename on 2015-12-18.
 */
public class Car {
    private Engine engine;

    private String warningMessage;

    public Car(Engine engine)
    {
        this.engine = engine;
    }

    public void accelerate()
    {
        engine.increaseRpm();

        if(engine.getRpm() > 5000)
        {
            warningMessage = "Slow Down!";
        }
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
}
