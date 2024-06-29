package dirapp;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import dirapp.data.Person;
import dirapp.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        
        // SortedSet adalah turunan dari Set, namun element element didalamnya akan diurutkan secara otomatis
        // jika element nya adalah turunan interface Comparable, maka akan diurutkan otomatis menggunakan comparable tersebut
        // jika element nya bukan turunan interface Comparable, maka bisa menggunakan Comparator untuk mengurutkannya
        // SortedSet adalah interface, untuk membuat object nya bisa menggunakan class yg implement, contohnya TreeSet()

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // .reversed() untuk membalikkan hasil sorted

        people.add(new Person("Dira"));
        people.add(new Person("Sanjaya"));
        people.add(new Person("Wardana"));

        for(var person: people){
            System.out.println(person.getName());
        }

        // merubah SortedSet menjadi immutable, sama seperti Immutable Set
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("DirApp"));
    }
}

// beberapa method dalam SortedSet
// comparator(): Comparator<? super E>
// subSet(E, E): SortedSet<E>
// headSet(E): SortedSet<E>
// first(): E
// last(): E