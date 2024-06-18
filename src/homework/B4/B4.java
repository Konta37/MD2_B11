package homework.B4;

import java.util.ArrayList;

public class B4 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) (Math.random()*10));
        }
        System.out.println(listNumber);
        int check=listNumber.get(0);
        for (int i = 0; i < listNumber.toArray().length; i++) {
            for (int j = i; j < listNumber.size(); j++) {
                if (listNumber.get(i)>listNumber.get(j)) {
                    check=listNumber.get(i);
                    listNumber.set(i, listNumber.get(j));
                    listNumber.set(j, check);
                }
            }
        }
        System.out.println(listNumber);
        listNumber.sort(Integer::compareTo);
        System.out.println(listNumber);
    }
}
