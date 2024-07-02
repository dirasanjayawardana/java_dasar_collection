package dirapp;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        
        // Legacy Collection (collection jadul, sudah jarang digunakan)
        // Stack class adalah salah satu legacy collection
        // Stack class mirip dengan Queue, sekarang stack hampir tidak dipakai lagi
        Stack<String> stack = new Stack<>();

        stack.push("Dira");
        stack.push("Sanjaya");
        stack.push("Wardana");

        for(var value = stack.pop(); value != null; value = stack.pop()){
          System.out.println(value);
        }
    }
}
