package State;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class OffState implements State {


    public void currentState(Light l)
    {
         System.out.println("The light is off.");
         l.setLightState(new OnState());

    }
    public String toString()
    {
        return "Off State";
    }
}
