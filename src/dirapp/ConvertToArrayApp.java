package dirapp;

import java.util.Arrays;
import java.util.List;

public class ConvertToArrayApp {
    public static void main(String[] args) {

        // method toArray() --> mengubah collection menjadi array
        // method toArray(T[] {}) --> mengubah collection menjadi array T

        List<String> names = List.of("Dira", "Sanjaya", "Wardana");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[] {});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
