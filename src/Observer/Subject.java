package Observer;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Subject {

    ArrayList<Observer> subscribers;
    String subjectState;
    public Subject()
    {
        subscribers=new ArrayList<>();
        subjectState="";
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        notifyAllSubscibers(subjectState);

    }

    public void attach(Observer o)
    {
        subscribers.add(o);
    }
    public void notifyAllSubscibers(String changedState)
    {
        for(Observer o:subscribers)
        {
            o.update(changedState);
        }

    }

}
