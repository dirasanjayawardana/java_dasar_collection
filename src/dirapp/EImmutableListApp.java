package dirapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EImmutableListApp {
    public static void main(String[] args) {
        
        // ImmutableList (list yang datanya tidak bisa diubah), secara default List bersifat mutable
        // namun object element didalamnya tetap bisa diubah, misal di dalam immutable list berisi object Person
        // maka field dalam object Person tetap bisa diubah

        // membuat immutable list yg berisi satu elemen
        List<String> one = Collections.singletonList("Satu");

        // membuat immutable list yang isinya kosong
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Dira");
        mutable.add("Sanjaya");

        // mengubah mutable list menjadi immutable list
        List<String> immutable = Collections.unmodifiableList(mutable);

        // membuat immutable list yang berisi beberapa elemen
        List<String> elements = List.of("Dira", "Sanjaya", "Wardana");
    }
}
