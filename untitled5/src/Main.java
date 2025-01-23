import java.util.Arrays;
import java.util.Comparator;

record BookDTO(String title, String author, double price, int yearOfPublication){

}

record Address(String street, int houseNumber, String postalCode, String city){

}

record Person(String firstName, String lastName, Address address){

}

record Car(String brand,String model,double fuelConsumptionPer100km){
    double fuelCost(double fuelPrice, double distance){
        return (distance/100) * fuelConsumptionPer100km * fuelPrice;
    }
}

record BankAccount(String accNumber,double accCash){
    public BankAccount(String accNumber){
        this(accNumber,0);
    }
}


interface Authentication{
    abstract boolean login(String login,String password);
    abstract void logout();
    abstract boolean resetPassword(String username, String oldPassword,String newPassword);

}
class UserAuthentication implements Authentication{

    @Override
    public boolean login(String login, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return false;
    }
}

class AdminAuthentication implements Authentication{

    @Override
    public boolean login(String login, String password) {
        return false;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return false;
    }
}

interface VechicleManager{
    abstract String startEngine();
    abstract int getFuelLevel();
}

class sportCar implements VechicleManager{

    @Override
    public String startEngine() {
        return "Silnik samochodu uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}

class Motorcycle implements VechicleManager{

    @Override
    public String startEngine() {
        return "Silnik motocykla uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 30;
    }
}

class Item implements Comparable<Item>{
    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Item o) {
        return Double.compare(this.weight,o.weight);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Order implements Comparable<Order> {
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public int compareTo(Order other) {
        // Sortowanie malejąco według ceny jednostkowej
        int priceComparison = Double.compare(other.unitPrice, this.unitPrice);
        if (priceComparison != 0) {
            return priceComparison; // Jeśli ceny są różne, zwróć wynik porównania cen
        }
        // Jeśli ceny są równe, sortuj rosnąco według ilości
        return Integer.compare(this.quantity, other.quantity);
    }

    @Override
    public String toString() {
        return "Order{productName='" + productName + "', quantity=" + quantity + ", unitPrice=" + unitPrice + "}";
    }
}

class Samochod{
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", cena=" + cena +
                '}';
    }
}
class RokProdukcjiComparator implements Comparator<Samochod> {
    @Override
    public int compare(Samochod s1, Samochod s2) {
        return Integer.compare(s1.getRokProdukcji(), s2.getRokProdukcji());
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        // Porównanie po cenie
        int priceComparison = Double.compare(p1.getPrice(), p2.getPrice());
        if (priceComparison != 0) {
            return priceComparison; // Jeśli ceny są różne, zwróć wynik porównania cen
        }
        // Jeśli ceny są równe, porównaj po id
        return Integer.compare(p1.getId(), p2.getId());
    }
}
class Song {
    private String title;
    private String artist;
    private int duration; // w sekundach

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{title='" + title + "', artist='" + artist + "', duration=" + duration + " seconds}";
    }
}

class DurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        return Integer.compare(s1.getDuration(), s2.getDuration());
    }
}

class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        int artistComparison = s1.getArtist().compareTo(s2.getArtist());
        if (artistComparison != 0) {
            return artistComparison; // Porównanie po artyście
        }
        return s1.getTitle().compareTo(s2.getTitle()); // Porównanie po tytule
    }
}


class Student1 implements Cloneable {
    private String name;
    private int age;
    private double grade;

    public Student1(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}
public class Main {
    public static void main(String[] args) {
        Television tele = new Television();
        tele.turnON();
        AdminAuthentication admin = new AdminAuthentication();

        Student[] students = new Student[5];
        students[0] = new Student("Jan Kowalski", 4.5, 2000);
        students[1] = new Student("Anna Nowak", 3.8, 1999);
        students[2] = new Student("Piotr Wiśniewski", 4.9, 2001);
        students[3] = new Student("Katarzyna Jankowska", 4.2, 2000);
        students[4] = new Student("Marek Zawadzki", 3.5, 1998);
        Arrays.sort(students);
        Item[] items = new Item[4];
        items[0] = new Item("Scyzoryk", 0.2);
        items[1] = new Item("200 kg sztangA", 200);
        items[2] = new Item("Michał Wiśniewski", 85);
        items[3] = new Item("Kostka rubkia", 0.1);
        Arrays.sort(items);
        for (Item item : items) {
            System.out.println(item.toString());
        }
        Samochod[] samochody = new Samochod[5];


        samochody[0] = new Samochod("Toyota", 2015, 50000);
        samochody[1] = new Samochod("Ford", 2018, 60000);
        samochody[2] = new Samochod("BMW", 2012, 80000);
        samochody[3] = new Samochod("Audi", 2020, 90000);
        samochody[4] = new Samochod("Volkswagen", 2016, 55000);
        Arrays.sort(samochody, new RokProdukcjiComparator());
        for (Samochod samochod : samochody) {
            System.out.println(samochod.toString());
        }

        Product[] products = new Product[5];
        products[0] = new Product(1, "Laptop", 1500.00);
        products[1] = new Product(2, "Smartphone", 800.00);
        products[2] = new Product(3, "Tablet", 800.00);
        products[3] = new Product(4, "Monitor", 300.00);
        products[4] = new Product(5, "Keyboard", 50.00);

        // Sortowanie tablicy produktów według ceny i id
        Arrays.sort(products, new PriceComparator());

        // Wyświetlenie posortowanej listy produktów
        for (Product product : products) {
            System.out.println(product);
        }


        Song[] songs = new Song[5];
        songs[0] = new Song("Shape of You", "Ed Sheeran", 240);
        songs[1] = new Song("Blinding Lights", "The Weeknd", 200);
        songs[2] = new Song("Someone Like You", "Adele", 285);
        songs[3] = new Song("Rolling in the Deep", "Adele", 228);
        songs[4] = new Song("Perfect", "Ed Sheeran", 263);

        // Sortowanie tablicy piosenek według długości, a przy równości według artysty i tytułu
        Arrays.sort(songs, new Comparator<Song>() {
            @Override
            public int compare(Song s1, Song s2) {
                int durationComparison = Integer.compare(s1.getDuration(), s2.getDuration());
                if (durationComparison != 0) {
                    return durationComparison; // Porównanie po długości
                }
                // Jeśli długości są równe, porównaj po artyście i tytule
                return new ArtistTitleComparator().compare(s1, s2);
            }
        });

        // Wyświetlenie posortowanej listy piosenek
        for (Song song : songs) {
            System.out.println(song);
        }


        try {
            // Tworzenie oryginalnego obiektu Student
            Student1 originalStudent = new Student1("Jan Kowalski", 35, 2);
            // Klonowanie obiektu
            Student1 clonedStudent = (Student1) originalStudent.clone();

            // Zmiana oceny oryginalnego studenta
            originalStudent.setGrade(3.8);

            // Wyświetlenie ocen obu studentów
            System.out.println("Oryginalny student: " + originalStudent);
            System.out.println("Sklonowany student: " + clonedStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}




