package set;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.Arrays;


public class SetResearch {
    public static void main(String[] args) {
        setInterfaceBulkOperations();
    }

    private static void setInterfaceBasicOperations() {
        Set<String> distinctWords = Arrays.asList("A","A","B").stream()
                .collect(Collectors.toSet());

        System.out.println(distinctWords);

        Set<String> set = new HashSet<String>();
        set.add("A");
        System.out.println(set);
    }

    private static void setInterfaceBulkOperations() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        Set<String> set2 = new HashSet<String>();
        set2.addAll(set);
        System.out.println(set2);

        set2.removeAll(set);
        System.out.println(set2);

    }

}

class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : Arrays.asList("1","2","2"))
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}