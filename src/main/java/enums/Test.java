package enums;


enum C {
    A1,
    B2
}

enum Parent {
    A,
    B
}

interface childEnumInterface <Parent> {

}

public enum Test implements childEnumInterface {
    C(Parent.A),
    D(Parent.B);

    private final Parent parent;

    Test(final Parent parent) {
        this.parent = parent;
    }

    public static void main(String[] args) {
        C test = C.valueOf(C.class, "1A1");
        System.out.print(Parent.valueOf(Test.class, "D"));
    }
}
