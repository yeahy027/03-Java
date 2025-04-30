package d20250430.ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample2 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("포도", 3000));
        fruits.add(new Fruit("수박", 10000));
        fruits.add(new Fruit("딸기", 6000));

        Collections.sort(fruits, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if (o1.price < o2.price) return -1;
                else if (o1.price == o2.price) return 0;
                else return 1;
            }
        });

        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
