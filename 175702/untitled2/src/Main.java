import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    int[] tab ={5,4,3,2,7,1,2};
        int a = 2002;



    }

    public static int podciag(int[] tab){
        int start = tab[0];
        int dlugosc = 0;
        int maxdlugosc = 0;
        int dlugosctablicy = tab.length;
        for(int i = 0;i<tab.length;i++){
            if(tab[i]>start){
                start = tab[i];
                maxdlugosc = dlugosc;
                dlugosc = 0;
            }
            else{
                dlugosc=dlugosc +1;

            }
        }
        if(maxdlugosc>dlugosc){
            return maxdlugosc;
        }
        else{
            return dlugosc;
        }

    }
    public static int podciag(int[] tab,int r){
        int start = tab[0];
        int dlugosc = 0;
        int maxdlugosc = 0;
        int dlugosctablicy = tab.length;
        for(int i = 1;i<tab.length;i++){
            if(tab[i]>start&&(start-tab[i])!=r){
                start = tab[i];
                maxdlugosc = dlugosc;
                dlugosc = 0;
            }
            else{
                dlugosc=dlugosc +1;

            }
        }
        if(maxdlugosc>dlugosc){
            return maxdlugosc;
        }
        else{
            return dlugosc;
        }

    }
    public static boolean dokladnosc(int x,int y,int k){
        boolean wynik = true;
        int left = x-y;
        if(left>0){
            left=left;
        }
        else{
            left=left*-1;
        }
        if(left<=Math.pow(10,-k)){
            return wynik=true;
        }
        else{
            return wynik=false;
        }
    }
    public static int najblizszySasiad(double S){
        double wynik = Math.sqrt(S);
        return (int)wynik;
    }
    public static void czyPalindrom(int n) {
        int start = 10;
        int i = 0;
        int []tab = new int[10];
        while(true){
            if(n%start==n){

                break;
            }
            else{
                start = start * 10;
                tab[i]=n%start;
                System.out.println(tab[i]);
                i++;
            }
        }



    }
}