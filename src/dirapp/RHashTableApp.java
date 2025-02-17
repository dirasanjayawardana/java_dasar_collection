package dirapp;

import java.util.Hashtable;
import java.util.Map;

public class RHashTableApp {
    public static void main(String[] args) {
        
        // Legacy Collection (collection jadul, sudah jarang digunakan)
        // HashTable class adalah salah satu legacy collection
        // HashTable class mirip dengan HashMap, bedanya semua method di HashTable class adalah syncronized (sehingga Thread safe)
        // kinerja nya lambat karena sychronize, sehingga jarang digunakan

        Map<String, String> map = new Hashtable<>();

        map.put("Dira", "Dira");
        map.put("Sanjaya", "Sanjaya");
        map.put("Wardana", "Wardana");

        for (var key : map.keySet()) {
          System.out.println(key);
        }

    }
}
