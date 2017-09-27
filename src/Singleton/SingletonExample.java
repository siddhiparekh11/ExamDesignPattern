package Singleton;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class SingletonExample {

    private static SingletonExample singleObj;

    private SingletonExample()
    {

    }
    public static SingletonExample getInstance()
    {
        if(singleObj==null)
        {
            singleObj=new SingletonExample();
        }
        return singleObj;
    }

}
