package Composite;

/**
 * Created by siddhiparekh11 on 8/8/17.
 */
public interface Component {

    public void addComponent(Component c);
    public void removeComponent(Component c);
    public Component getChild(int i);
    public void operation();

}
