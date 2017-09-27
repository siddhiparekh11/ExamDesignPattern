package Decorator;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class CreamCondiment extends CondimentsDecorator {

    public CreamCondiment(Beverage b)
    {
        super(b);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " with Cream added.";

    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
