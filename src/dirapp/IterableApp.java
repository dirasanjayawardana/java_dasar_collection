package dirapp;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        // Interface Iterable digunakan sebagai kontrak untuk mengiterasi data secara sequential
        // Interface Collection digunakan sebagai kontrak untuk memanipulasi data collection, seperti menambah, menghapus, dan mengecek isi data collection

        // Iterable merupakan object yg bisa berisi kumpulan data yang bisa diiterasi dengan for each
        // saat melakukan foreach Iterable sebenarnya itu akan mengakses iterator di dalam Iterable 
        Iterable<String> names = List.of("Dira", "Sanjaya", "Wardana");

        // Setiap class iterable bisa dilakukan foreach
        for (var name : names) {
            System.out.println(name);
        }


        // contoh melakukan iterasi manual dengan Iterator, sebelum ada foreach
        System.out.println("ITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}