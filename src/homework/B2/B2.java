package homework.B2;

import java.util.ArrayList;
import java.util.Arrays;

public class B2 {
    public static void main(String[] args) {

        String str ="Rikkei Academy để nông dân biết code";
        String[] strSplit = str.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));
        System.out.println(list);
    }
}
