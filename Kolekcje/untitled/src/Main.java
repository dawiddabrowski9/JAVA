import java.util.Collection;
import java.util.*;

public class Main {

    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>(items);
        for(T item: uniqueElements){
            System.out.println(item);
        }
    }

    public<T> ArrayList<T> mergeList(ArrayList<T> a1,ArrayList<T> a2){
        ArrayList<T> merged = new ArrayList<T>();
        merged.addAll(a1);
        merged.addAll(a2);
        return merged;
    }

    public<T> boolean isPalindrome(LinkedList<T> list){
        int left = 0;
        int right = list.size()-1;
        while(left < right){
            if(!(list.get(left).equals(list.get(right)))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static <T> HashSet<T>findUniqueElements(List<T> list){
        HashSet<T> unique = new HashSet<>();
        unique.addAll(list);
        return unique;
    }

    public static <T> TreeSet<T>findElementsInRange(TreeSet<T> t1, T lowerBound, T upperBound){
        return new TreeSet<>(t1.subSet(lowerBound,true,upperBound,true));
    }


    public <K,V> HashMap<V,Integer> countValueOccurrencies(HashMap<K,V> map){
        HashMap<V,Integer> occurencies = new HashMap<>();
        for(V item : map.values()){
            occurencies.merge(item,1,Integer::sum);
        }
        return occurencies;
    }

    public <K,V> TreeMap<K,V> subMapInRange(TreeMap<K,V> map, K startKey, K endKey){
        return new TreeMap<>(map.subMap(startKey,true,endKey,true));
    }
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(1);
            list.add(2);
            list.add(3);
            HashSet set = findUniqueElements(list);
            TreeSet<Integer> tree = new TreeSet<>();
            tree.add(1);
            tree.add(4);
            tree.add(3);
            tree.add(6);
            tree.add(8);
            tree.add(9);
            TreeSet<Integer> tree1 = findElementsInRange(tree,1,5);


    }
}