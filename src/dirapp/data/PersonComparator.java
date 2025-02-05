package dirapp.data;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // return 0 jika sama dengan, return negative jika kurang dari, return positive jika lebih dari
        // akan menghasilkan urutan Ascending
        return o1.getName().compareTo(o2.getName());
    }

}
