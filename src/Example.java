import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {

    private static final Person person1 = new Person("Sponge", "Bob", 43);
    private static final Person person2 = new Person("Patrick", "Star", 40);
    private static final Person person3 = new Person("Billy", "Junior", 18);

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(Arrays.asList(person1,person2,person3));
        list = Collections.unmodifiableList(list);
        System.out.println(list);
        person1.setAge(66);
        System.out.println(list);
        list.remove(person1);
    }
}
