package Observer;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Observer2  implements Observer{

    public Observer2(Subject s)
    {
        s.attach(this);
    }

    public void update(String newState)
    {
        System.out.println("Observer2 has been notified of the new state:" + newState);
    }
}
