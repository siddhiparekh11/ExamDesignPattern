package Decorator;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Coffee implements Beverage {


    public String getDescription() {
        return "This is Coffee";
    }


    public double getCost() {
        return 3.95;
    }
}
