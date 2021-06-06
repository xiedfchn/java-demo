package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ListIterator;

public class ListResearch {
    public static void main(String[] args) {
        interator();


//        List list = new LinkedList<Integer>();
//        final long start = System.currentTimeMillis();
//        for(int i = 0; i < 1000000; i++) {
//            list.add(-1, i);
//        }
//        final long end = System.currentTimeMillis();
//        System.out.println(end - start);
    }
    private static void positionalAccess() {
        add();
    }

    private static void search() {
        List list = new ArrayList(Arrays.asList(1,2,3, 2, 4));
        int i = list.indexOf(2);
        int j = list.lastIndexOf(2);
        System.out.print(i); // 1;
        System.out.print(j); // 3;

    }

    private static void interator() {
        List<Integer> list = new ArrayList(Arrays.asList(1,2,3, 2, 4));

        for (ListIterator<Integer> it = list.listIterator(list.size()); it.hasPrevious(); ) {
            Integer t = it.previous();
            System.out.print(t);
        }
    }

    private static void sublist() {
        List list = new ArrayList(Arrays.asList(1,2,3,4));
        List list2 = list.subList(0, 1);
        System.out.print(list2); // [1]

        list.subList(0, 1).clear();
        System.out.print(list); // [2,3,4];
    }

    private static void add() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.print(list); // [1]
    }

    private static void set() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1));
        list.set(0, 2);
        System.out.print(list); // [2]
    }

    private static void access() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2));
        int secondElement = list.get(1);
        System.out.print(secondElement); // 2
    }
    private static void remove() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2));
        list.remove(1);
        System.out.print(list); // [1]
    }

    private static void addAll() {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> list2  = new ArrayList<Integer>(Arrays.asList(0));
        System.out.print(list2); // [0]
        list2.addAll(0, list1);
        System.out.print(list2); // [1,2,3,4]
    }

    private static void aggregatesIntoList() {

        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }

        List<Person> people = new ArrayList(Arrays.asList(new Person("Mike"), new Person("David")));
        List<String> list = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.print(list);
    }

    private static <E> void swap(List<E> list, int i, int j) {
        E tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

}
