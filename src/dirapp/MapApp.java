package dirapp;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class MapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        
        // Map adalah struktur data collection yang berisikan mapping data antara key dan value
        // key pada map harus unik, jika duplikat maka akan replace key sebelumnya
        // berbeda dengan array atau list yang menggunakan index
        // Map<keyType, valueType> ada interface, untuk membuat objectnya bisa dengan class yang implementasi Map, seperti:
        // HashMap(), WeakHashMap(), IdentitiyHashMap(), LinkedHashMap(), EnumHashMap()


        // HashMap() adalah implementasi Map yang melakukan distribusi key menggunakan hashCode() function
        // untuk pengecekan kesamaan datanya menggunakan method equals()
        System.out.println("===== HASH MAP ======");
        Map<String, String> map1 = new HashMap<>();
        map1.put("name.first", "Dira"); // put() --> insert or update
        map1.put("name.middle", "Sanjaya");
        map1.put("name.last", "Wardana");

        System.out.println(map1.get("name.first"));
        System.out.println(map1.get("name.middle"));
        System.out.println(map1.get("name.last"));


        // WeakHashMap() mirip seperti HashMap(), bedanya menggunakan week key
        // jika tidak digunakan lagi maka secara otomatis data di WeakHashMap() akan dihapus
        // di java kita tidak mengelola memory secara manual, sudah dimaintance oleh java
        // java akan menjalankan Gargabe Collection, ini akan menghapus data data yang jarang atau tidak dipakai lagi
        // WeakHashMap() cocok untuk menyimpan data sementara atau cache
        System.out.println("\n ===== WEAK HASH MAP ======");
        Map<Integer, Integer> map2 = new WeakHashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            map2.put(i, i);
        }
        // trigger running Garbage Collection
        System.gc();
        System.out.println(map2.size() + " --> beberapa data akan dihapus, sehingga tidak 1000000 lagi");


        // Identitiy HashMap() mirip seperti HashMap(), bedanya adalah cara pengecekan kesamaan datanya
        // menggunakan operator == (reference equality), bukan menggunakan method equals()
        // artinya data dianggap sama, jika memang lokasi di memory tersebut sama
        System.out.println("\n ===== IDENTITY HASH MAP ======");
        Map<String, String> map3 = new IdentityHashMap<>();

        String key1 = "name.first";
        String name = "name";
        String dot = ".";
        String first = "first";
        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map3.put(key1, "Dira");
        map3.put(key2, "Dira");
        System.out.println(map3.size());


        // LinkedHashMap() adalah implementasi Map dengan menggunakan double linked list
        // data yang disimpan akan berurutan, akan lambat ketika melakukan get karena harus iterasi data satu persatu
        // setiap data ada connector untuk next data dan previous data, bukan berupa array tapi berupa node
        System.out.println("\n ===== LINKED HASH MAP ======");
        Map<String, String> map4 = new LinkedHashMap<>();

        map4.put("first", "Dira");
        map4.put("last", "Sanjaya");
        map4.put("middle", "Wardana");
                    
        Set<String> keys = map4.keySet();
        for (var key : keys) {
          System.out.println(key);
        }


        // EnumMap() adalah implementasi Map dengan keynya adalah Enum
        // karena data Enum sudah pasti unik, sehingga cocok dijadikan key di Map
        // Algoritma pendistribusian key dioptimalkan untuk enum, sehingga lebih optimal dibanding method hashCode()
        System.out.println("\n ===== ENUM HASH MAP ======");
        Map<Level, String> map5 = new EnumMap<Level, String>(Level.class);
        map5.put(Level.FREE, "Dira");
        map5.put(Level.VIP, "Sanjaya");

        for (var key : map5.keySet()){
          System.out.println(map5.get(key));
        }
    }
}


// method yang ada di Interface Map
// int size();
// boolean isEmpty();
// boolean containsKey(Object key);
// boolean containsValue(Object value);
// V get(Object key);
// V put(K key, V value);
// V remove(Object key);
// void putAll(Map<? extends K, ? extends V> m);
// void clear();
// Set<K> keySet();
// Collection<V> values();
// Set<Map.Entry<K, V>> entrySet();
// K getKey();
// V getValue();
// V setValue(V value);
// boolean equals(Object o);
// int hashCode();
// boolean equals(Object o);
// int hashCode();
// V getOrDefault(Object key, V defaultValue)
// void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
// V putIfAbsent(K key, V value)
// boolean remove(Object key, Object value)
// boolean replace(K key, V oldValue, V newValue)
// V replace(K key, V value)
// V merge