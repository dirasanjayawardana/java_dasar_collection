package dirapp;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class NSortedMapApp {
    public static void main(String[] args) {

        // SortedMap adalah implementasi Map dengan data key diurutkan sesuai dengan
        // Comparable key atau bisa menggunakan Comparator
        // cocok untuk kasus yang posisi key pada Map harus berurut

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // secara default String sudah implements Comparable, sehingga tidak wajib pakai comparator
        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Sanjaya", "Sanjaya");
        sortedMap.put("Dira", "Dira");
        sortedMap.put("Wardana", "Wardana");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        // Immutable SortedMap
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
        // immutable.put("Nugraha", "Nugraha"); // akan error
    }
}

// beberapa method dalam SortedMap
// comparator(): Comparator<? super K>
// subMap(K, K): SortedMap<K, V>
// headMap(K): SortedMap<K, V>
// tailMap(K): SortedMap<K, V>
// firstKey(): K
// lastKey(): K