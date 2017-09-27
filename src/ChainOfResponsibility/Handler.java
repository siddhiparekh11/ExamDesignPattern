package ChainOfResponsibility;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public abstract class Handler {


    Handler nextHandler;
    public abstract void conductMeeting();


}
