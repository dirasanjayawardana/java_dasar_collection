package dirapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDefaultMethod {
    public static void main(String[] args) {
        
        // void copy(listTo, listFrom) --> copy semua data dari listFrom ke listTo
        // int frequency(collection, object) --> mengambil beberapa banyak element yang sama dengan object
        // max(collection) dan max(collection, comparator) --> mengambil element paling tinggi di list
        // min(collection) dan min(collection, comparator) --> mengambil element paling rendah di list
        // void reverse(list) --> membalikkan seluruh element di list
        // void shuffle(list) --> mengacak posisi element di list
        // void swap(list, from, to) --> menukar posisi element from ke to di list
        // dll

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Dira", "Sanjaya", "Wardana", "Budi", "Andi", "Eko"));

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
