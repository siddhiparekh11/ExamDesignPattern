package State;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class OnState implements State {


    public void currentState(Light l)
    {
        System.out.println("The light is on.");
        l.setLightState(new OffState());

    }
    public String toString()
    {
        return "On State";
    }
}
