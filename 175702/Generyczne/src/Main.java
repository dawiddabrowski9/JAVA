import java.util.ArrayList;
import java.util.List;
class Box<T>{
    T obiekt;

    public T getObiekt() {
        return obiekt;
    }

    public void setObiekt(T obiekt) {
        this.obiekt = obiekt;
    }

}

class Counter<T>{
    List<T> lista = new ArrayList<T>();
    public void add(T t1){
        lista.add(t1);
    }
    public int getCounter(){
        return lista.size();
    }
}

class Animal{
    private String name;

    public Animal( String name) {
        this.name = name;
    }

}

class Dog extends Animal{
    private int age;
    public Dog(int age, String name) {
        super(name);
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}

class Pair<T>{
    private T e1;
    private T e2;

    public void setE1(T e1){
        this.e1 = e1;
    }
    public void setE2(T e2){
        this.e2 = e2;
    }

    public T getE1() {
        return e1;
    }

    public T getE2() {
        return e2;
    }
}




public class Main {
    /*
    public static <T extends Animal> T findMax(T element1, T element2){
        if(element1.getAge()>element2.getAge()){
            return element1;
        }
        else{
            return element2;
        }
    }
    */
    public static void findMinMaxAge(Dog[] t1, Pair<? super Dog> wynik){
        Dog min = t1[0];
        Dog max = t1[0];

        for(Dog dog : t1){
            if(dog.getAge() < min.getAge()){
                min = dog;
            }
            if(dog.getAge() > max.getAge()){
                max = dog;
            }
        }

        wynik.setE1(min);
        wynik.setE2(max);
    }

    public static void findMax(Pair<? extends Dog> pair){
        Dog e1 = pair.getE1();
        Dog e2 = pair.getE2();

        if(e1.getAge()>e2.getAge()){
            System.out.println(e1.toString());
        }
        else{
            System.out.println(e2.toString());
        }

    }

    public static <T extends Comparable<T>> T minValue(T[] t1){
        if(t1 == null || t1.length ==0){
            throw new IllegalArgumentException("Tablica jest pusta");
        }
        T min = t1[0];
        for(T i : t1){
            if(i.compareTo(min)<0){
                min = i;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.setObiekt(123);
        b1.setObiekt(1234);
        System.out.println(b1.getObiekt());

        Dog[] t1 = {
                new Dog(3,"Misio"),
                new Dog(5,"Reksio"),
                new Dog(10,"Azor"),
                new Dog(1,"Buba")
        };

        Pair<Dog> wynik = new Pair<>();
        findMinMaxAge(t1,wynik);
        System.out.println("najmlodszy pies " + wynik.getE1());
        System.out.println("najstarszy pies " + wynik.getE2());

    }
}