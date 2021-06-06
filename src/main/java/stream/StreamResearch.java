package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamResearch {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        persons.add(new Person(Person.Sex.FEMALE, "Michael"));
        persons.add(new Person(Person.Sex.MALE, "Maja"));

        Stream personStream = persons
                .stream()
                .filter(e -> e.getGender() == Person.Sex.FEMALE);

        List<Person> filteredList = (List<Person>) personStream.collect(Collectors.toList());
        System.out.print(filteredList);
    }
}

class Person {
    public enum Sex {
        MALE, FEMALE
    }
    String name;
    Sex gender;

    Person(Sex gender, String name){
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Sex getGender() {
        return this.gender;
    }
}
