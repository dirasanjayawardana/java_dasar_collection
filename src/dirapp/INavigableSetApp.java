package dirapp;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class INavigableSetApp {
    public static void main(String[] args) {

        // NavigableSet adalah turunan dari SortedSet, semua method SortedSet bisa digunakan di NavigableSet
        // NavigableSet menambah method untuk melakukan navigasi atau pencarian element
        // seperti mencari element yang lebih dari, kurang dari, atau membalikkan urutan set, dll
        // NavigableSet adalah interface, untuk membuat object nya bisa menggunakan class yg implement, contohnya TreeSet()

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Dira", "Sanjaya", "Wardana", "DirApp"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> sanjaya = names.tailSet("Sanjaya", true);

        for (var name : sanjaya) {
            System.out.println(name);
        }

        // membuat NavigableSet menjadi immutable
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Ups");
    }
}


// beberapa method untuk melakukan navigasi di NavigableSet
// lower(E): E
// floor(E): E
// ceiling(E): E
// higher(E): E
// pollFirst(): E --> mengambil data pertama dan dihapus dari Set
// pollLast(): E --> mengambil data terakhir dan dihapus dari Set
// descendingSet(): NavigableSet<E>
// descendingIterator(): Iterator<E>
// subSet(E, boolean, E, boolean): NvigableSet
// headSet(E, boolean): NavigableSet<E> --> mengambil data dari depan sampai data ke E
// tailSet(E, boolean): NavigableSet<E> --> mengambil data dari belakang sampai data ke E

