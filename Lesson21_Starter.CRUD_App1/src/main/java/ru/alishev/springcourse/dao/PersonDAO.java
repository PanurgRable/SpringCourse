package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {

     private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(1, "Nom"));
        people.add(new Person(2, "Tob"));
        people.add(new Person(3, "MInm"));
        people.add(new Person(4, "ROn"));
        people.add(new Person(5, "Nrto"));
    }

    public List<Person> index() {

        return people;
    }
    public  Person show (int id) {
        return  people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
