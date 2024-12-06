import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Magazyn {
    private HashMap<Produkt, Integer> produkty;


    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc){
        produkty.put(produkt,ilosc);
    }

    public void wyswietlAsortyment(){
        System.out.println("--------------------------");
        for(Produkt i : produkty.keySet()){
            System.out.println("Produkt:"+ i +"Ilość: "+produkty.get(i));
        }
    }
}
