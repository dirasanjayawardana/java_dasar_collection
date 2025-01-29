package dirapp;

import java.util.List;

import dirapp.data.Person;

public class DMutableApp {
    public static void main(String[] args) {

        Person person = new Person("Dira");

        person.addHobby("Game");
        person.addHobby("Coding");

        // akan gagal karena return dari getHobbies() sudah dibuat immutable
        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }
}
