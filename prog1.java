import java.util.*;

public class prog1 {
    public static void main(String[] args) {
        
        TreeSet<Integer> integerSet = new TreeSet<>();

        
        integerSet.add(5);
        integerSet.add(2);
        integerSet.add(8);
        integerSet.add(1);
        integerSet.add(3);

        
        System.out.println("Sorted list of integers:");
        for (int num : integerSet) {
            System.out.println(num);
        }
    }
}
