package Proxy;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class ImageProxy implements Image {

    String authToken;
    public ImageProxy(String authToken)
    {
        this.authToken=authToken;
    }
    public void display()
    {
        if(authToken.equals("12356"))
        {
            System.out.println("User is genuine.");
            RealImage i=new RealImage();
            i.display();
        }

    }
}
