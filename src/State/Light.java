package State;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Light {

    private State lightState;
    public Light()
    {
        lightState=new OffState();
    }

    public State getLightState() {
        return lightState;
    }

    public void setLightState(State lightState) {
        this.lightState = lightState;
    }
    public void pressButton()
    {

        lightState.currentState(this);
    }
}
