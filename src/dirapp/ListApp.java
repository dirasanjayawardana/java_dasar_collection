package dirapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args){

        // List adalah struktur data collection yang memiliki sifat:
        // Elemen di List bisa duplikat
        // Data List berurut sesuai dengan posisi saat memasukkan data
        // List memiliki index sehingga bisa menggunakan index untuk mendapatkan elemen di List
        // List merupakan interface, bukan class, jadi tidak bisa membuat object secara langsung dengan new List()
        // bisa membuat object List dengan class yang implement List, seperti ArrayList<>() dan LinkedList<>()

        // ArrayList adalah list menggunakan array, default size nya 10, namun jika penuh akan bertambah sesuai data
        List<String> strings = new ArrayList<>();

        // LinkedList adalah list dengan struktur data Double Linked List
        // setiap data ada connector untuk next data dan previous data, bukan berupa array tapi berupa node
        // LinkedList lebih cepat ketika add data dan remove data, namun lebih lambat ketika get data dan set data karena harus membaca data satu persatu, dibandingkan dengan ArrayList
        // List<String> strings = new LinkedList<>();

        strings.add("Dira");
        strings.add("Sanjaya");

        strings.set(0, "DirApp");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings){
          System.out.println(value);
        }

    }
}

// Semua method yg ada di collection bisa digunakan di List, beberapa method tambahan di List:
// addAll(int, Collection<? extends E>): boolean
// replaceAll(UnaryOperator<E>): void
// sort(Comparator<? super E>): void
// get(int): E
// set(int, E): E
// add(int, E): void
// remove(int): E
// indexOf(Object): int
// lastIndexOf(Object): int
// listIterator(): ListIterator<E>
// listIterator(int): ListIterator<E>
// subList(int, int): List<E>
