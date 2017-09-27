package Decorator;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public abstract class CondimentsDecorator implements Beverage {

    Beverage b;

    public CondimentsDecorator(Beverage b)
    {
        this.b=b;
    }

    public String getDescription() {
        return b.getDescription();
    }


    public double getCost() {
        return b.getCost();
    }
}
