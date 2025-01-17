import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        tab1.add(1);
        tab1.add(3);
        tab1.add(5);
        tab1.add(7);
        tab2.add(2);
        tab2.add(4);
        tab2.add(6);
        tab2.add(8);

        //mergeSorted(tab1,tab2);
        toArrayList("ala");
    }
    public static void append(ArrayList tab1,ArrayList tab2){
        ArrayList<Integer> tabWynik = new ArrayList<>();
        for(int i =0;i<tab1.size();i++){
            tabWynik.add((Integer) tab1.get(i));
        }
        for(int i =0;i<tab2.size();i++){
            tabWynik.add((Integer)tab2.get(i));
        }
        System.out.println(tabWynik);
    }
    public static void merge(ArrayList tab1,ArrayList tab2){
        ArrayList<Integer> tabWynik = new ArrayList<>();
       for(int i=0;i<tab1.size();i++){
            tabWynik.add((Integer)tab1.get(i));
            tabWynik.add((Integer)tab2.get(i));
        }
        System.out.println(tabWynik);
    }

    public static void mergeSorted(ArrayList tab1,ArrayList tab2){
        ArrayList<Integer> tabWynik = new ArrayList<Integer>();
        int i =0;
        int j =0;
        while(i < tab1.size() && j < tab2.size()) {
            if ((Integer) tab1.get(i) < (Integer) tab2.get(j)) {
                tabWynik.add((Integer) tab1.get(i));
                i++;
            } else {
                tabWynik.add((Integer) tab2.get(i));
                j++;
            }
        }
        while(i < tab1.size()){
            tabWynik.add((Integer)tab1.get(i));
            i++;
        }
        while(i < tab2.size()){
            tabWynik.add((Integer)tab1.get(i));
            j++;
        }


        System.out.println(tabWynik);
    }

    public static void toArrayList(String napis){
        ArrayList<String> tabWynik =  new ArrayList<String>();
        String[] pom  = napis.split("");
        int pom1;
        for(int i = 0; i<pom.length;i++){
            for(int j  =0;i<pom.length-i-1;j++){

            }
        }
    }
}
