package practice.B3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class B3 {
    public static void main(String[] args) {
        String str ="Rikkei Academy để nông dân biết code";
        String[] strSplit = str.split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));
        System.out.println(list);
        String min = Collections.min(list, Comparator.comparing(String::length));
        System.out.println(min);
        String max = Collections.max(list, Comparator.comparing(String::length));
        System.out.println(max);
    }
}
