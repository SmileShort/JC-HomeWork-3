package geekbrains.HomeWork;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Box<Apple> box1 = new Box<>(new Apple(), new Apple(), new Apple());
    box1.getWeightOfBox();
    System.out.println(box1.getWeightOfBox());

    Box<Orange> box2 = new Box<>(new Orange(),new Orange(),new Orange());
    box2.getWeightOfBox();
    System.out.println(box2.getWeightOfBox());

    box1.compare(box2);
    System.out.println(box1.compare(box2));


    ArrayList<Orange> box5 = new ArrayList <>();
    box5.add(new Orange());
    box5.add(new Orange());
    box5.add(new Orange());
    box5.add(new Orange());
    System.out.println(box5.get(0).getWeight() * box5.size());

    ArrayList<Orange> box6 = new ArrayList <>();
    box6.add(new Orange());

    }
}
