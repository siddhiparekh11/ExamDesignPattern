/**
 * Created by siddhiparekh11 on 8/8/17.
 */
import Adapter.*;

import Command.*;

import Proxy.*;
import Singleton.*;
import Observer.*;
import State.*;
import Factory.*;
import Decorator.*;
import Strategy.*;
import ChainOfResponsibility.*;
import Composite.*;
public class Controller {

    public static void main(String[] args){

       /*Singleton pattern
        SingletonExample s;
        s=SingletonExample.getInstance();

       //Observer pattern
        Subject sub=new Subject();
        Observer o1=new Observer1(sub);
        Observer o2=new Observer2(sub);

        sub.setSubjectState("State1");
        sub.setSubjectState("State2");

        //State pattern
        Light l=new Light();
        System.out.println("The current state of the light is " + l.getLightState().toString());
        l.setLightState(new OnState());
        System.out.println("Press switch to change the state");
        l.pressButton();
        System.out.println("Press switch to change the state");
        l.pressButton();
        System.out.println("Press switch to change the state");
        l.pressButton();

       ShapeFactory f=new ShapeFactory();
       Shape s=f.getShape("Rectangle");
       s.draw();
       s=f.getShape("Circle");
       s.draw();

        ImageProxy p=new ImageProxy("12356");
        p.display();

       Beverage b=new Coffee();
       System.out.println(b.getDescription());
       System.out.println("Price: " + b.getCost());

       System.out.println("Let's add some cream to coffee");
       Beverage b1=new CreamCondiment(b);

        System.out.println(b1.getDescription());
        System.out.println("Price: " + b1.getCost());

        Operation o=new AdditionOperation();
        Context c=new Context(o);
        System.out.println("Addition of two objects: " + c.executeOperation(2,3));

        o=new MultiplyOperation();
        c=new Context(o);
        System.out.println("Multiplication of two objects: " + c.executeOperation(2,3));

        Target client= new Adapter();
        client.print();

       Handler h=new Handler1();
       h.conductMeeting();


        Invoker i = new Invoker();
        Receiver r=new Receiver();
        ConcreteCommand1 c=new ConcreteCommand1(r);
        ConcreteCommand2 c1=new ConcreteCommand2(r);

        i.setCom(c);
        i.invokeCommand();

        i.setCom(c1);
        i.invokeCommand();*/

       Component c=new Composite("Composite Object 1");
       c.addComponent(new Leaf("Leaf Object 1"));
       c.addComponent(new Leaf("Leaf Object 2"));


       c.operation();

       c.addComponent(new Leaf("Leaf Object 3"));

       c.getChild(2).operation();









    }
}
