package dirapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BCollectionApp {
    public static void main(String[] args) {

        // Interface Iterable digunakan sebagai kontrak untuk mengiterasi data secara sequential
        // Interface Collection digunakan sebagai kontrak untuk memanipulasi data collection, seperti menambah, menghapus, dan mengecek isi data collection

        Collection<String> collection = new ArrayList<>();

        collection.add("Dira");
        collection.add("Sanjaya");
        collection.add("Wardana");
        collection.addAll(List.of("Dirapp", "Java", "Dasar"));

        for (var value: collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");
        collection.remove("Dira");
        collection.removeAll(List.of("Java", "Dasar"));

        for (var value: collection){
            System.out.println(value);
        }

        System.out.println("CONTAINS");
        System.out.println(collection.contains("Dira"));
        System.out.println(collection.contains("Sanjaya"));
        System.out.println(collection.containsAll(List.of("Sanjaya", "Wardana")));
    }
}

// Beberapa Method di Java Collection
// size(): int
// isEmpty(): boolean
// contains(Object): boolean
// toArray(): Object[]
// toArray(T[]): T[]
// add(E): boolean
// remove(Object): boolean
// containsAll(Collection<?>): boolean
// addAll(Collection<? extends E>): boolean
// removeAll(Collection<? extends E>): boolean
// removeIf(Predicate<? super E>): boolean
// retainAll(Collection<?>): boolean
// clear(): void
// stream(): Stream<E>
// parallelStream(): Stream<E>
