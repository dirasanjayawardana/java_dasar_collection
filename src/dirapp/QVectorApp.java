package dirapp;

import java.util.List;
import java.util.Vector;

public class QVectorApp {
    public static void main(String[] args) {

        // Legacy Collection (collection jadul, sudah jarang digunakan)
        // vector class adalah salah satu legacy collection
        // Vector class mirip dengan ArrayList, bedanya semua method di Vector class adalah syncronized (sehingga Thread safe)
        // kinerja nya lambat karena sychronize, sehingga jarang digunakan

        List<String> list = new Vector<>();

        list.add("Dira");
        list.add("Sanjaya");
        list.add("Wardana");
    
        for (var value : list){
          System.out.println(value);
        }
    
    }
}
