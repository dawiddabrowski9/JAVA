class Person implements Comparable<Person>{
     private String name;
     private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class Main {
    public static <T extends Comparable<T>> T minValue(T[] list){
        T min = list[0];
        for(T t : list){
            if(t.compareTo(min)<0){
                min = t;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Person[] persons = {
            new Person("Dawid", 18),
            new Person("Dawid", 2),
            new Person("Dawid", 38),

        };
        Person youngest = minValue(persons);
        System.out.println("The youngest person is: " + youngest);

    }
}
