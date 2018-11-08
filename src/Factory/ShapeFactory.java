package Factory;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class ShapeFactory {

    public static Shape getShape(String type)
    {
        Shape s=null;
        if(type.equals("Rectangle"))
           s= new Rectangle();
        else if(type.equals("Circle"))
           s= new Circle();

        return s;

    }
}
