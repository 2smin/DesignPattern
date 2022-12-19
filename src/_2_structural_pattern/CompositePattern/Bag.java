package _2_structural_pattern.CompositePattern;

import java.util.ArrayList;
import java.util.Collection;

public class Bag implements Component{

    Collection<Component> itemList = new ArrayList<Component>();

    public void insertComponent(Component component){
        itemList.add(component);
    }

    public void deleteComponent(Component component){
        itemList.remove(component);
    }

    @Override
    public int getPrice() {

        int sum = itemList.stream().mapToInt(Component::getPrice).sum();
        return sum;
    }
}
