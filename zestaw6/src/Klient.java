import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie z) {
        listaZamowien.add(z);
    }

    public void wyswietlHistorieZamowien(){
        int i = 1;
        for(Zamowienie z : listaZamowien){
            System.out.println("Zamowienie "+i);
            z.wyswietlZamowienie();
            i++;
        }
    }
    public double obliczLacznyKosztZamowien(){
        double koszt = 0;
        for(Zamowienie z : listaZamowien){
            KoszykZakupowy k = z.getKoszykZakupowy();
            koszt += k.obliczCalkowitaWartosc();
        }
        return koszt;
    }
}
