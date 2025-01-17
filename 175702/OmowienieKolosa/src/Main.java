import java.lang.Math;
public class Main {
    /* GRUPA 1
    public static int[] zad1(int n,int m,int a1,int[]r){
        int [] wynik=new int [n];
        wynik[0]=a1;
        for(int i=1;i<n;i++){
            int suma=a1;
            for(int j=0;j<m;j++){
                suma+=Math.pow(i,j+1)*r[j];
            }
            wynik[i]=suma;
        }
        return wynik;
    }

    public static boolean zad2(int[]tab){
        int roznica = tab[1]-tab[0];
        for(int i=2;i<tab.length-1;i++){
            if(tab[i+1]-tab[i]!=roznica){
                return false;
            }

        }
        return true;
    }

    public static boolean zad3(int[]tab,int m){
        int[] wynik = tab;
        for(int i=0;i<m-1;i++){
            for(int j=0;i<tab.length-1-i;j++){
                tab[i]=tab[i+1]-tab[j];
            }
        }
        for(int i =0;i<wynik.length;i++){
            wynik[i]=tab[i];
        }
        if(zad2(wynik)==true){
            return true;
        }
            return false;
    }

    public static int zad4(int [] tab){
        int wynik = 1;
        int wynik_max=wynik;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i+1]>tab[i]){
                wynik++;
            }
            else{
                if(wynik_max<wynik){
                    wynik_max=wynik;
                }
                wynik = 1;
            }
        }
        if(wynik_max<wynik){
            wynik_max=wynik;
        }
        return wynik;
    }

    public static int zad5(int [] tab, int r){
        int wynik = 1;
        int wynik_max=wynik;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i+1]>tab[i] && tab[i]+r==tab[i+1]){
                wynik++;
            }
            else{
                if(wynik_max<wynik){
                    wynik_max=wynik;
                }
                wynik = 1;
            }
        }
        if(wynik_max<wynik){
            wynik_max=wynik;
        }
        return wynik;
    }
    public static void zad6(int n,int c){
        System.out.println(c);
        while (n>1){
            if(c%2==0){
                c/=2;
            }
            else{
                c=c*3+1;
            }
            System.out.println(c);
            n--;
        }
    }
    public static void zad7(int n,int c){
        int min=c;
        int max=c;
        while (n>1){
            if(c%2==0){
                c/=2;
            }
            else{
                c=c*3+1;
            }
            if(c>max){
                max=c;
            }
            if(c<min){
                min=c;
            }
            n--;
        }
        System.out.println("min="+min);
        System.out.println("max="+max);

    }

    public static void main(String[] args) {


        int[]tab=zad1(5,3,1,new int[]{1,3,1});
        for (int i = 1; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println(zad2(tab));
        System.out.println(zad4(new int[]{1,2,0,3,5,1,4}));
    }
    GRUPA 2
    */
    public static boolean zad1(double x ,double y, int k){
        if(Math.abs(x-y)<=Math.pow(10,-k)){return true;}

        return false;
    }
    public static int zad2(int S){
        int i = 0;
        while(!(S>Math.pow(i,2)&& S<Math.pow(i+1,2)))
        {

            i++;
        }
        if(Math.abs(S-Math.pow(i,2))>Math.abs(S-Math.pow(i+1,2))){
            return i+1;
        }
        return i;
    }
    public static double zad3(int S,int n,int k){
        double x = S-1;
        double x_next = ((n-1)*x+S/Math.pow(x,n-1))/n;
        while(!(zad1(x,x_next,k))){
            x = x_next;
            x_next = ((n-1)*x+S/Math.pow(x,n-1));
        }
        return x;
    }
    public static void main(String[] args) {



    }
}

