package Map.PractiseExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person
{
    String name;
    String city;
    String state;

    Person(String name, String city, String state)
    {
        this.name = name;
        this.city = city;
        this.state = state;

    }

    public String getCity(){ return city;}
    public String getState(){ return state;}

    public String toString(){
        return name;
    }
}
public class PersonByCityAndState {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Asha","Pune","MH"),
                new Person("Ravi","Mumbai","MH"),
                new Person("John","New York","NY"),
                new Person("Sam","Pune","MH"),
                new Person("Amy","New York","NY"),
                new Person("Reddy","Tirupati","Andhra Pradesh"),
                new Person("Ayyappa","Tirupati","Andhra Pradesh")
        );

        Map<String, List<Person>> peopleByCity = persons.stream().collect(Collectors.groupingBy(Person :: getCity));

//        peopleByCity.forEach((city,people) -> {
//            System.out.println(city + " --> " + people);
//        });

        Map<String, Map<String, List<Person>>> peopleByCityAndState = persons.stream().collect(Collectors.groupingBy((Person ::getState) , Collectors.groupingBy(Person :: getCity)));

        peopleByCityAndState.forEach((state, cityMap) -> {
            System.out.println(state + " : " );
            cityMap.forEach((city, list) -> {
                System.out.println(city + " --> " + list);
            });
        });
    }
}
