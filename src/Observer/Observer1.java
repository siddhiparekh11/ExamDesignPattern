package Observer;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Observer1 implements Observer {

    public Observer1(Subject s)
    {
        s.attach(this);
    }

    public void update(String newState)
    {
        System.out.println("Observer1 has been notified of the new state:" + newState);
    }
}
