package dirapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        
        // secara default List di java sudah memiliki ditur search atau getData, namun dilakukan secara sequential (berurutan satu persatu)
        // Binary Search (salah satu algoritma pencarian data yang populer)
        // Binary Search hanya bisa dilakukan jika datanya telah berurutan, cara menggunakan Binary Search di List
        // Collections.binarySearch(list, value) atau Collections.binarySearch(list, vlaue, comparator)

        List<Integer> list = new ArrayList<>(1000);
        for (int i = 1; i <= 1000; i++) {
          list.add(i);
        }

        int index = Collections.binarySearch(list, 333);
        System.out.println(index);
        System.out.println(list.get(index));

        Comparator<Integer> comparator = new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
          }
        };

        int index2 = Collections.binarySearch(list, 333);
        System.out.println(index2);
    }
}
