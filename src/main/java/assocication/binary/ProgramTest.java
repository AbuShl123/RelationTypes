package assocication.binary;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 145; i++) {
            Faker faker = new Faker();
            Employee employee = new Employee(faker.name().firstName(), faker.name().lastName());
            employee.card = new Card(CardHelper.getFreeId());
            list.add(employee.card.getId());
            System.out.println(employee.name + "'s id is = " + employee.card.getId());
        }

        Set<Integer> set = new HashSet<>(list);
        System.out.println(list.size() == set.size()); // if there is no duplicates in the list (which means that all ids are unique) --> list and set size will be equal. Statement will print true verifying that CartHelper.getFreeCard() works properly
    }
}
