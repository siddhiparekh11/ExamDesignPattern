package Decorator;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class HotChocolate implements Beverage {


    public String getDescription() {
        return "This is Hot Chocolate.";
    }
    public double getCost(){
        return 2.95;
    }
}
