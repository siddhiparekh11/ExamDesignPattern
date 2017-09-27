package Composite;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public class Leaf implements Component {

    String s;

    public Leaf(String s)
    {
        this.s=s;
    }

    public void addComponent(Component c) {

    }

    public void removeComponent(Component c) {

    }

    public Component getChild(int i) {
        return null;
    }

    public void operation() {

        System.out.println(s);

    }
}
