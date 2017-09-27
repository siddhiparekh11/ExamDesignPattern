package Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Composite implements Component {

   String s;
    ArrayList<Component> arr;
   public Composite(String s){
       arr=new ArrayList<Component>();
       this.s=s;
    }


    public void addComponent(Component c) {

       arr.add(c);

    }


    public void removeComponent(Component c) {

       arr.remove(c);

    }


    public Component getChild(int i) {
        return arr.get(i);
    }


    public void operation() {


        System.out.println(s);
        Iterator<Component> i=arr.iterator();
        while(i.hasNext())
        {
            i.next().operation();
        }

    }
}
