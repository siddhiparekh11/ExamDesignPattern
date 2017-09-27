package Command;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
//Remote control
public class Invoker {

    private Command com;

    public void setCom(Command com) {
        this.com = com;
    }
    public void invokeCommand()
    {
        com.execute();
    }
}
