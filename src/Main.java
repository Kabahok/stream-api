import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)],
                    Education.values()[new Random().nextInt(Education.values().length)]
            ));
        }

//        1 пункт задачи
        long countOfMinors = persons.stream().filter(x -> x.getAge() < 18).count();

//        2 пункт задачи
        List<String> listOfConscript = persons.stream().filter(x -> (x.getAge() <= 27 && x.getAge() >= 18)).map(Person::getFamily).collect(Collectors.toList());

//        3 пункт задачи
        List<Person> countOfOperable = persons.stream().filter(x -> x.getEducation()
                .equals(Education.HIGHER)).filter(x -> x.getAge() >= 18
        && ((x.getSex().equals(Sex.WOMAN) && x.getAge() <= 60)) || (x.getSex().equals(Sex.MAN) && x.getAge() <= 65))
                .sorted(Comparator.comparing(Person::getFamily))
                .collect(Collectors.toList());
    }
}

