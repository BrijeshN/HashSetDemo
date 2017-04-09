package hashsetdemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        
        System.out.println("Simple HashSet program");
        
        HashSet<Integer> intSet = new HashSet<>();
        
        intSet.add(2);
        intSet.add(7);
        
        // Ignored since 7 is already in the set
        intSet.add(7);
        intSet.add(3);
        
        printSet(intSet);
        intSet.remove(3);
        
        printSet(intSet);
        
        System.out.println("Set contains 2: " + intSet.contains(2));
        System.out.println("Set contains 3: " + intSet.contains(3));

    }
    
    public static void printSet(HashSet<Integer> intSet){
        System.out.println("The set contains:");
        for(Object obj : intSet.toArray()){
            Integer num = (Integer) obj;
            System.out.println(num.intValue());
        }
    }
    
}
