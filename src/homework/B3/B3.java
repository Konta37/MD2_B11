package homework.B3;

import java.sql.SQLOutput;
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
        System.out.println("=================");
        int minLength = list.get(0).length();
        int indexMin =0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < minLength){
                minLength = list.get(i).length();
                indexMin = i;
            }
        }
        System.out.println("Ptu min la: " + list.get(indexMin));
    }
}
