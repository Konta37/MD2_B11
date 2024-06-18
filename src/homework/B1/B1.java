package homework.B1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class B1 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add((int) (Math.random()*10));
        }
        System.out.println(number);
        System.out.println("max");
        System.out.println( Collections.max(number));
        Collections.reverse(number);
        System.out.println("Reversed number:");
        System.out.println(number);
        System.out.println("sort");
        Collections.sort(number);
        List<Integer> number2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number2.add((int) (Math.random()*10));
        }
        System.out.println("array 2:");
        System.out.println(number2);
        System.out.println("array 1 before");
        System.out.println(number);
        System.out.println("array 1 after");
        number.addAll(number2);
        System.out.println(number);


    }
}
