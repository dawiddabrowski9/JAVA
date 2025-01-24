
public class Main {
    public static <T> boolean isEqualOrNull(T obiekt1, T obiekt2){
        if(obiekt1==null&&obiekt2==null){
            return true;
        }

        else if (obiekt1==obiekt2) {

            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args) {
        Triple triple = new Triple("A",2,20.20);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());

        int a =4;
        int b= 2;
        System.out.println(isEqualOrNull(a,b));
        String c = "Kasia";
        String d = "Kasia";
        System.out.println(isEqualOrNull(c,d));
        String e=null;
        String f=null;
        System.out.println(isEqualOrNull(e,f));



    }
    
    
}