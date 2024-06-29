package dirapp;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        
        // Set adalah collection yang berisikan elemen elemen yang unik, tidak boleh duplicate
        // jika memasukkan data yang sama kedalam set, maka data yang diterima hanya satu
        // Set tidak memiliki index seperti list, tidak ada jaminan data dalam set akan berurut
        // Set hanya memiliki method yg ada di parennya, yaitu Colection dan Iterable
        // karena tidak memiliki index, untuk mengambil data di Set harus iterasi satu persatu
        // sama seperti List, Set merupakan interface, bukan class, jadi tidak bisa membuat object langsung dengan new Set()
        // bisa membuat object Set dengan class yang implement Set, seperti HashSet<>(), LinkedHashSet<>(), atau EnumSet


        // HashSet<>() tidak menjamin data terurut
        Set<String> names = new HashSet<>();

        // LinkedHashSet<>() menjamin data terurut sesuai dengan urutan saat menambahkan data
        // setiap data ada connector untuk next data dan previous data, bukan berupa array tapi berupa node
        // Set<String> names = new LinkedHashSet<>();

        names.add("Dira");
        names.add("Sanjaya");
        names.add("Wardana");
        names.add("Dira");
        names.add("Sanjaya");
        names.add("Wardana");

        for (var name : names) {
          System.out.println(name);
        }

        
        // EnumSet adalah Set yang tipe datanya harus Enum
        Set<Gender> genders = EnumSet.allOf(Gender.class);

        // jika hanya ingin salah satu data enum saja
        // Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.FEMALE);
        
        for (var gender: genders){
          System.out.println(gender);
        }
    }
}
