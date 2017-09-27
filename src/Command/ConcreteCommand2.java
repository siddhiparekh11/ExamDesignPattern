package Command;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
//Light off
public class ConcreteCommand2 implements Command {

    Receiver r;
    public ConcreteCommand2(Receiver r)
    {
        this.r=r;
    }
    public void execute()
    {
       r.setFalse();
    }

}
