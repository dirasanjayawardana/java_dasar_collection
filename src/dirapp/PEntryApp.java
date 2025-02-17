package dirapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PEntryApp {
    public static void main(String[] args) {
        
        // saat menyimpan data di Map, data disimpan dalam pair (key-value)
        // di java Collection, implementasi Pair di Map bernama Entry
        // Entry adalah inner interface sederhana pada Map yang berisikan method untuk mengambil key dan value

        Map<String, String> map = new HashMap<>();

        map.put("Dira", "Dira Value");
        map.put("Sanjaya", "Sanjaya Value");
        map.put("Wardana", "Wardana Value");

        // values() mengambil valuenya saja
        // keySet() mengambil keynya saja
        // entrySet() mengambil key dan value, sehingga bisa menggunakan getKey() dan getValue()
        Set<Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
          System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

// beberapa method di Entry Interface
// getKey(): K --> mengambil data key
// getValue(): V --> mengambil data value
// setValue(V value): V
// comparingByKey(): Comparator<Entry<K,V>> --> mengambil data comparator
// comparingByValue(): Comparator<Entry<K,V>>
// comparingByKey(Comparator<? super K>): Comparator
// comparingByValue(Comparator<? super K>): Comparator