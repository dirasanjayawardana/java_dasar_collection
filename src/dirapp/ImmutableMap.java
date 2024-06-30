package dirapp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        
        // ImmutableMap (Map yang datanya tidak bisa diubah), secara default Map bersifat mutable
        // namun object element didalamnya tetap bisa diubah, misal di dalam immutable map berisi object Person
        // maka field dalam object Person tetap bisa diubah

        // membuat immutable map yg berisi satu elemen
        Map<String, String> singleton = Collections.singletonMap("name", "Dira");

        // membuat immutable map yang isinya kosong
        Map<String, String> empty = Collections.emptyMap();

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Dira");

        // mengubah mutable map menjadi immutable list
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        // membuat immutable map yang berisi beberapa elemen
        Map<String, String> map = Map.of(
            "first", "Dira",
            "middle", "Sanjaya",
            "last", "Wardana"
         );
        // map.put("a", "A"); // akan error
    }
}
