package homework.B5;

import java.util.ArrayList;

public class B5 {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.add(6);
        listNumber.add(8);
        listNumber.add(9);
        listNumber.add(10);
        listNumber.add(15);
        System.out.println(listNumber);
        listNumber.removeIf(i -> i % 2 == 0);
//        for (int i = 0; i < listNumber.size(); i++) {
//            if(listNumber.get(i)%2==0){
//                listNumber.remove(i);
//            }
//        }
        System.out.println(listNumber);
    }
}
