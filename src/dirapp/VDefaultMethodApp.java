package dirapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class VDefaultMethodApp {
    public static void main(String[] args) {
        
        // Default Method List dan Iterable:
        // Iterable.forEach(consumer) --> melakukan iterasi seluruh data collection
        // List.removeIf(predicate) --> menghapus data di collection menggunakan predicate
        // List.replaceAll(operator) --> mengubah seluruh data di collection

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
          numbers.add(i);
        }
        // System.out.println(numbers);

        numbers.replaceAll(new UnaryOperator<Integer>() {
          @Override
          public Integer apply(Integer integer) {
            return integer * 10;
          }
        });
        // System.out.println(numbers);

        numbers.forEach(new Consumer<Integer>() {
          @Override
          public void accept(Integer integer) {
            System.out.println(integer);
          }
        });

        // jika menggunakan lambda (->) expression
        numbers.forEach(item -> System.out.println(item));

        numbers.removeIf(new Predicate<Integer>() {
          @Override
          public boolean test(Integer integer) {
            return integer > 500;
          }
        });
        // System.out.println(numbers);


        // Default Method di Map
        // getOrDefault(key, defaultValue) --> mengambil data berdasarkan key, jika tidak ada akan return defaultValue
        // forEach(consumer) --> melakukan iterasi seluruh data key-value
        // replaceAll(function) --> mengubah seluruh data value
        // putIfAbsent(key, value) --> simpan data jika data belum ada
        // remove(key, value) --> hapus jika key-value nya sama

        Map<String, String> map = new HashMap<>();
        map.put("Dira", "Dira Value");
        map.put("Sanjaya", "Sanjaya Value");
        map.put("Wardana", "Wardana Value");

        map.forEach(new BiConsumer<String, String>() {
          @Override
          public void accept(String key, String value) {
            System.out.println(key + ": " + value);
          }
        });

        // jika menggunakan lambda (->) expression
        map.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
