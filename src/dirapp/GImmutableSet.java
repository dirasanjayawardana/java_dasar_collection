package dirapp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GImmutableSet {
    public static void main(String[] args) {

        // ImmutableSet (Set yang datanya tidak bisa diubah)

        // membuat immutable Set yang isinya kosong
        Set<String> empty = Collections.emptySet();

        // membuat immutable Set yg berisi satu elemen
        Set<String> one = Collections.singleton("Dira");

        Set<String> mutable = new HashSet<>();
        mutable.add("Dira");
        mutable.add("Sanjaya");

        // mengubah mutable Set menjadi immutable Set
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        // membuat immutable Set yang berisi beberapa elemen
        Set<String> set = Set.of("Dira", "Sanjaya");

        // set.add("Dira"); error
        // set.remove("Dira"); error
    }
}
