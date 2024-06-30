package dirapp;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        
        // NavigabeMap adalah turunan dari SortedMap, semua method SortedMap bisa digunakan di NavigableMap
        // NavigableMap memiliki tambahan method untuk memiliki kemampuan navigasi pencarian
        // seperti operasi kurang dari, lebih dari, dll
        // contoh ketika ingin mengambil data yang lebih dari key X atau kurang dari key Y
        // NavigableMap adalah interface, untuk membuat object nya bisa menggunakan class yg implement, contohnya TreeSet()
       
        NavigableMap<String, String> map = new TreeMap<>();

        // karena NavigableMap adalah turunan dari sortedMap, maka akan otomatis di urutkan
        map.put("Sanjaya", "Sanjaya");
        map.put("Dira", "Dira");
        map.put("Wardana", "Wardana");
            
        for (var key : map.keySet()){
          System.out.println("KEY: " + key);
        }
     
        System.out.println("LOWER KEY: " + map.lowerKey("Dira"));
        System.out.println("HIGHER KEY: " + map.higherKey("Dira"));
     
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()){
          System.out.println("DESCENDING MAP: " + key);
        }
     
        // Immutable NavigableMap
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
     
        // immutable.put("Dira", "Dira"); // akan error
    }
}

// beberapa method untuk melakukan navigasi di NavigableMap
// Map.Entry<K,V> lowerEntry(K key);
// K lowerKey(K key);
// Map.Entry<K,V> floorEntry(K key);
// K floorKey(K key);
// Map.Entry<K,V> ceilingEntry(K key);
// K ceilingKey(K key);
// Map.Entry<K,V> higherEntry(K key);
// K higherKey(K key);
// Map.Entry<K,V> firstEntry();
// Map.Entry<K,V> lastEntry();
// Map.Entry<K,V> pollFirstEntry();
// Map.Entry<K,V> pollLastEntry();
// NavigableMap<K,V> descendingMap();
// NavigableSet<K> navigableKeySet();
// NavigableSet<K> descendingKeySet();
// NavigableMap<K,V> headMap(K toKey, boolean inclusive);
// NavigableMap<K,V> tailMap(K fromKey, boolean inclusive);
// SortedMap<K,V> subMap(K fromKey, K toKey);
// SortedMap<K,V> headMap(K toKey);
// SortedMap<K,V> tailMap(K fromKey);