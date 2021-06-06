package map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Iterator;

public class MapResearch {
    public static void main(String args[]) {
        collectionViews();
    }

    private static void basicOperations() {
        Map<String, String> map = new HashMap<>();
        map.put("Mike", "male");
        System.out.print(map);

        String value = map.get("Mike");
        System.out.print(value);

        System.out.print(map.containsKey("Mike")); // true
        System.out.print(map.containsValue("male")); // true

        map.remove("Mike");
        System.out.print(map);
    }

    private static void bulkOperations() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Mike", "male");
        Map<String, String> map2 = new HashMap<>();

        map2.putAll(map1);
        System.out.print(map2);

        map1.clear();
        System.out.print(map1);

    }

    private static void collectionViews() {
        Map<String, String> map = new HashMap<>();
        map.put("Mike", "male");
        map.put("Maja", "female");
        for(String key: map.keySet()) {
            System.out.println(key);
        }

        System.out.print(map.values() );
        System.out.print("123");

        for (Iterator<String> it = map.keySet().iterator(); it.hasNext(); )
            System.out.println(it.next());

        for (Iterator<String> it = map.values().iterator(); it.hasNext(); )
            System.out.println(it.next());

        for(Map.Entry<String, String> e: map.entrySet()) {
            System.out.println(e);
        }

        Map<String, String> map2 = new HashMap<>();
        map2.put("Mike", "male");
        map2.put("Maja", "female");

        System.out.print(map2);

        if(map.entrySet().equals(map2.entrySet())) {
            System.out.println(true);
        }

        if(map.entrySet().containsAll(map2.entrySet())) {
            System.out.println(true);
        }

    }

    private static void createMap() {
        List<Employee> employees = new ArrayList();
        Department it = new Department("IT");
        Department hr = new Department("HR");
        employees.add(new Employee(Employee.Sex.FEMALE, "mike", it));
        employees.add(new Employee(Employee.Sex.FEMALE, "mike2", it));
        employees.add(new Employee(Employee.Sex.FEMALE, "maja", hr));

        Map<Department, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        List itEmployees = byDept.get(it);
        System.out.print(itEmployees.toString());
    }
}

class Department {
    String name;
    Department(String name) {
        this.name = name;
    }
}

class Employee {
    public enum Sex {
        MALE, FEMALE
    }
    String name;
    Department department;
    Sex gender;

    Employee(Sex gender, String name, Department department){
        this.gender = gender;
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        return this.department;
    }
    public String getName() {
        return this.name;
    }

    public Sex getGender() {
        return this.gender;
    }
}