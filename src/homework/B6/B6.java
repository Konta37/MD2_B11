package homework.B6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class B6 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(1);
        listNumber.add(2);
//        for (int i = 0; i < 10; i++) {
//            listNumber.add(i);
//        }
        Set<Integer> setNumber = new HashSet<>();
        setNumber.addAll(listNumber);
        System.out.println(setNumber);
    }
}
