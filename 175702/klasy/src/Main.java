import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Produkt> test=new ArrayList<>();
        Produkt produkt = new Produkt("Zabawka",69.99f,100);
        Produkt produkt1 = new Produkt("Nerf",149.99f,1050);
        Produkt produkt2 = new Produkt("Pluszowy Mis",39.99f,333);

        KoszykZakupowy koszyk1 = new KoszykZakupowy(test);
        koszyk1.dodajProdukt(produkt1);
        koszyk1.dodajProdukt(produkt1);
        koszyk1.dodajProdukt(produkt1);
        koszyk1.dodajProdukt(produkt1);
        koszyk1.dodajProdukt(produkt1);

        Zamowienie zamowienie1 = new Zamowienie(koszyk1,"Zrealizowane");
        zamowienie1.wyswietlZamowienie();
        zamowienie1.ustawStatusZamowienia();
        zamowienie1.wyswietlZamowienie();
        }
    }
class Produkt{
    public String nazwa;
    public float cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa,float cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie=iloscNaMagazynie;
    }
    public void wyswietlInformacje(){
        System.out.println("nazwa: " + nazwa + " Cena: " + cena +" Ilosc na magazynie: " +iloscNaMagazynie);
    }
    public void dodajDoMagazynu(int n){
        iloscNaMagazynie += n;
    }
    public void usunZMagazynu(int n){
        iloscNaMagazynie -=n;
       if(iloscNaMagazynie<0){
           iloscNaMagazynie=0;
       }

    }
}
class KoszykZakupowy{
    private ArrayList<Produkt> koszyk;

    public KoszykZakupowy(ArrayList<Produkt> koszyk) {
        this.koszyk = koszyk;
    }

    public void dodajProdukt(Produkt produkt){
        if(produkt.iloscNaMagazynie>0){
            koszyk.add(produkt);
            produkt.usunZMagazynu(1);
        }
        else{
            System.out.println("Tego produktu nie ma na magazynie!");
        }
    }
    public void wyswietlZawartoscKoszyka(){
        for(int i=0;i<koszyk.size();i++){
            Produkt produkt = koszyk.get(i);
            produkt.wyswietlInformacje();
        }
    }
    public void obliczCalkowitaWartosc(){
        float suma = 0;
        for(int i=0;i<koszyk.size();i++){
            Produkt produkt = koszyk.get(i);
            suma += produkt.cena;
        }
        System.out.println(suma);
    }
}
class Zamowienie{
    public KoszykZakupowy koszyk;
    public String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszyk,String statusZamowienia) {
        this.koszyk = koszyk;
        this.statusZamowienia = statusZamowienia;
    }

    public void ustawStatusZamowienia(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj nowy status zamowienia: ");
        String newstatus = myObj.nextLine();
        statusZamowienia = newstatus;
    }
    public void wyswietlZamowienie(){
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println(statusZamowienia);
    }
}
class Klient{
    private String imie;
    private String nazwisko;
    public ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie,String Nazwisko,ArrayList<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
    }

}