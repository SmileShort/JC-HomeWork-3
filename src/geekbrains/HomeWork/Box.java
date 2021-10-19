package geekbrains.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    ArrayList <T> boxes;

    public Box (T container1, T container2,T container3){
        boxes = new ArrayList<>();
        boxes.add(container1);
        boxes.add(container2);
        boxes.add(container3);
    }

    public double getWeightOfBox(){
        return boxes.get(0).getWeight() * boxes.size();
    }

    public boolean compare(Box<?> anotherBox){
        if (this.getWeightOfBox() == anotherBox.getWeightOfBox())
            return true;
        else
            return false;
    }
}
