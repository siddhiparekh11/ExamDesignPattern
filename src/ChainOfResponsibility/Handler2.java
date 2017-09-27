package ChainOfResponsibility;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Handler2 extends Handler {

    Handler2(){
        nextHandler=new Handler3();
    }
    @Override
    public void conductMeeting() {
        System.out.println("Handler two is unavailable");
         nextHandler.conductMeeting();

    }
}
