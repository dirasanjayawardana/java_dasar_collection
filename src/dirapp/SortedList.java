package dirapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {

        // untuk melakukan sorting si list, menggunakan:
        // Collections.sort(list) atau Collection.sort(list, comparator)

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko"));

        // mengurutkan ascending
        Collections.sort(list);
        for (var value : list) {
            System.out.println(value);
        }

        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // sort dengan comparator
        Collections.sort(list, reverse);
        for (var value : list) {
            System.out.println(value);
        }
    }
}
