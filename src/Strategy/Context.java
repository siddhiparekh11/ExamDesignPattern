package Strategy;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Context {
    Operation o;
    public Context(Operation o)
    {
        this.o=o;
    }
    public int  executeOperation(int a,int b)
    {
        return o.doTask(a,b);
    }
}
