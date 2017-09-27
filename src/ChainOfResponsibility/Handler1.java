package ChainOfResponsibility;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Handler1 extends Handler {

    public Handler1(){
        nextHandler=new Handler2();
    }
    @Override
    public void conductMeeting() {

        System.out.println("Handler one is unavailable");
        nextHandler.conductMeeting();

    }
}
