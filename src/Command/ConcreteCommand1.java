package Command;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
//Light on
public class ConcreteCommand1 implements Command {

    Receiver r;
    public ConcreteCommand1(Receiver r)
    {
        this.r=r;
    }
    public void execute()
    {
         r.setTrue();
    }
}
